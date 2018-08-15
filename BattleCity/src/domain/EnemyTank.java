package domain;

import gameInterface.*;
import tool.CollsionUtils;
import tool.DrawUtils;
import tool.SoundUtils;

import java.io.IOException;
import java.util.Random;

public class EnemyTank extends Tank implements Moveable, Hitable, Destroyable {
    public int blood = 1; //blood血量
    private long lastTime = 0;
    private int index = 0;
    private int count = 0;
    private boolean startFlag = false;

    private String srcPath1 = "BattleCity\\res\\img\\enemy_1_u.gif";//图片地址
    private String srcPath2 = "BattleCity\\res\\img\\enemy_1_d.gif";//图片地址
    private String srcPath3 = "BattleCity\\res\\img\\enemy_1_l.gif";//图片地址
    private String srcPath4 = "BattleCity\\res\\img\\enemy_1_r.gif";//图片地址

    private String[] bornPath = {"BattleCity\\res\\img\\born1.gif", "BattleCity\\res\\img\\born2.gif", "BattleCity\\res\\img\\born3.gif", "BattleCity\\res\\img\\born4.gif"};//图片地址

    public EnemyTank(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            int[] size = DrawUtils.getSize(srcPath1);
            this.width = size[0];
            this.height = size[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw() {
        String srcPath = "";
        switch (direction) {
            case UP:
                srcPath = srcPath1;
                break;
            case DOWN:
                srcPath = srcPath2;
                break;
            case LEFT:
                srcPath = srcPath3;
                break;
            case RIGHT:
                srcPath = srcPath4;
                break;
        }
        try {
            if (startFlag) {
                DrawUtils.draw(srcPath, x, y);
            } else {
                if (index >= bornPath.length) {
                    index = 0;
                    count++;
                    if (count == 3) startFlag = true;
                }
                nowTime = System.currentTimeMillis();
                if (index < bornPath.length) DrawUtils.draw(bornPath[index], x, y);
                if (nowTime - lastTime > 100) {
                    index++;
                    lastTime = nowTime;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //一个方法随机生成方向
    public Direction getRandomDirection() {
        int num = new Random().nextInt(4);
        switch (num) {
            case 0:
                return Direction.UP;
            case 1:
                return Direction.DOWN;
            case 2:
                return Direction.LEFT;
            case 3:
                return Direction.RIGHT;
        }
        return null;
    }

    public void move() {
        if (!startFlag) return;//未开始不移动
        nowTime = System.currentTimeMillis();
        if (nowTime - lastMoveTime > 100) {//下一次移动所需毫秒数
            if (direction == badDirection && badDirection != null) {
                this.direction = getRandomDirection();
                return;
            }
            int num = new Random().nextInt(15);
            if (num == 1) {
                this.direction = getRandomDirection();
                return;
            }
            lastMoveTime = nowTime;
            switch (direction) {
                case UP:
                    y -= distance;
                    break;
                case DOWN:
                    y += distance;
                    break;
                case LEFT:
                    x -= distance;
                    break;
                case RIGHT:
                    x += distance;
                    break;
            }
            if (x < 0) {
                x = 0;
                this.direction = getRandomDirection();
            }
            if (x > Config.WIDTH - width) {
                x = Config.WIDTH - width;
                this.direction = getRandomDirection();
            }
            if (y < 0) {
                y = 0;
                this.direction = getRandomDirection();
            }
            if (y > Config.HEIGHT - height) {
                y = Config.HEIGHT - height;
                this.direction = getRandomDirection();
            }
        }
    }

    public Bullet shoot() {
        if (!startFlag) return null;//未开始不开枪
        nowTime = System.currentTimeMillis();
        if (nowTime - lastShootTime > 300) {//下一次攻击所需毫秒数
            try {
                SoundUtils.play("BattleCity\\res\\snd\\fire.wav");//播放子弹声音
            } catch (IOException e) {
                e.printStackTrace();
            }
            lastShootTime = nowTime;
            return new Bullet(this);
        }
        return null;
    }

    public boolean checkHit(Blockable block) {
        if (block instanceof Tools) return false;
        Element element = (Element) block;
        int x1 = element.x;
        int y1 = element.y;
        int w1 = element.width;
        int h1 = element.height;

        int x2 = this.x;
        int y2 = this.y;
        int w2 = this.width;
        int h2 = this.height;
        //模拟当前方向前进后的坐标
        switch (this.direction) {
            case UP:
                y2 -= distance;
                break;
            case DOWN:
                y2 += distance;
                break;
            case LEFT:
                x2 -= distance;
                break;
            case RIGHT:
                x2 += distance;
                break;
        }
        //根据模拟的坐标判断是否相撞
        flag = CollsionUtils.isCollsionWithRect(x1, y1, w1, h1, x2, y2, w2, h2);
        if (flag) {
            //相撞则生成一个相撞前的最后可移动距离badSpeed
            this.badDirection = this.direction;
            switch (badDirection) {
                case UP:
                    badDistance = y - y1 - h1;
                    break;
                case DOWN:
                    badDistance = y1 - y - height;
                    break;
                case LEFT:
                    badDistance = x - x1 - w1;
                    break;
                case RIGHT:
                    badDistance = x1 - x - width;
                    break;
            }
        } else this.badDirection = null;
        return flag;
    }

    @Override
    public boolean isDestroy() {
        if (blood > 0) return false;
        else return true;
    }

    @Override
    public Blast showAttack() {
        blood--;
        return new Blast(x, y, width, height, blood, this);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
