package domain;

import gameInterface.*;
import tool.CollsionUtils;
import tool.DrawUtils;

import java.io.IOException;

public class Bullet extends Element implements Attackable, Destroyable, Hitable {
    private Direction direction;
    private int blood = 1;
    private int distance = 12;//子弹速度，每次10个单位
    private boolean flag;//碰撞发生旗帜
    public Tank tank;//用来调用tank子类
    private int badDistance;//碰撞前的可移动距离，在发生碰撞前替代distance
    private String srcPath1 = "BattleCity\\res\\img\\bullet_u.gif";//图片地址
    private String srcPath2 = "BattleCity\\res\\img\\bullet_d.gif";//图片地址
    private String srcPath3 = "BattleCity\\res\\img\\bullet_l.gif";//图片地址
    private String srcPath4 = "BattleCity\\res\\img\\bullet_r.gif";//图片地址

    public Bullet(Tank tk) {
        this.tank = tk;
        int tx = tank.x;
        int ty = tank.y;
        int tw = tank.width;
        int th = tank.height;
        direction = tank.direction;
        switch (direction) {
            case UP:
                getSize(srcPath1);
                x = tx + (tw - width) / 2;
                y = ty - height;
                break;
            case DOWN:
                getSize(srcPath2);
                x = tx + (tw - width) / 2;
                y = ty + th;
                break;
            case LEFT:
                getSize(srcPath3);
                x = tx - width;
                y = ty + (th - height) / 2;
                break;
            case RIGHT:
                getSize(srcPath4);
                x = tx + tw;
                y = ty + (th - height) / 2;
                break;
        }
    }

    private void getSize(String srcPath) {
        try {
            int[] size = DrawUtils.getSize(srcPath);
            this.width = size[0];
            this.height = size[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw() {
        String srcPath = "";
        switch (direction) {
            case UP:
                srcPath = srcPath1;
                y -= distance;
                break;
            case DOWN:
                srcPath = srcPath2;
                y += distance;
                break;
            case LEFT:
                srcPath = srcPath3;
                x -= distance;
                break;
            case RIGHT:
                srcPath = srcPath4;
                x += distance;
                break;
        }
        try {
            DrawUtils.draw(srcPath, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkAttack(Hitable hitable) {
        Element element = (Element) hitable;
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
            switch (direction) {
                case UP:
                    distance = y - y1 - h1;
                    break;
                case DOWN:
                    distance = y1 - y - height;
                    break;
                case LEFT:
                    distance = x - x1 - w1;
                    break;
                case RIGHT:
                    distance = x1 - x - width;
                    break;
            }
        } else distance = 4;
        return flag;
    }

    @Override
    public boolean isDestroy() {
        if (y < 0 || y > Config.HEIGHT || x < 0 || x > Config.WIDTH || blood < 1) return true;
        else return false;
    }

    @Override
    public Blast showAttack() {
        blood--;
        return new Blast(x, y, width, height, blood, this);
    }
}
