package domain;

import gameInterface.*;
import tool.CollsionUtils;
import tool.DrawUtils;
import tool.SoundUtils;

import java.io.IOException;

public class MyTank extends Tank implements Moveable, Hitable, Destroyable {
    private int blood = 1; //blood血量

    private String srcPath1 = "BattleCity\\res\\img\\tank_u.gif";//图片地址
    private String srcPath2 = "BattleCity\\res\\img\\tank_d.gif";//图片地址
    private String srcPath3 = "BattleCity\\res\\img\\tank_l.gif";//图片地址
    private String srcPath4 = "BattleCity\\res\\img\\tank_r.gif";//图片地址

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public MyTank(int x, int y) {
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
            DrawUtils.draw(srcPath, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void move(Direction direction) {
        nowTime = System.currentTimeMillis();
        if (nowTime - lastMoveTime > 50) {//下一次移动所需毫秒数
            if (direction == badDirection && badDirection != null) {
                switch (direction) {
                    case UP:
                        y -= badDistance;
                        break;
                    case DOWN:
                        y += badDistance;
                        break;
                    case LEFT:
                        x -= badDistance;
                        break;
                    case RIGHT:
                        x += badDistance;
                        break;
                }
                System.out.println("不可移动");
                return;
            } else {
                if (this.direction != direction) {
                    this.direction = direction;
                    return;
                }
                lastMoveTime = nowTime;
                this.direction = direction;
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
                if (x < 0) x = 0;
                else if (x > Config.WIDTH - width) x = Config.WIDTH - width;
                if (y < 0) y = 0;
                else if (y > Config.HEIGHT - height) y = Config.HEIGHT - height;
            }
        }
    }

    public Bullet shoot() {
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
}
