package domain;

import gameInterface.Blockable;
import gameInterface.Direction;

import javax.swing.*;

public class Tank extends Element implements Blockable {
    protected Direction direction = Direction.UP;//记录坦克当前方向
    protected long lastShootTime = 0;//初始化最后射击时间
    protected long lastMoveTime = 0;//初始化最后移动时间
    protected Direction badDirection;//会发生碰撞的方向
    public int badDistance;//碰撞前的可移动距离，在发生碰撞前替代distance
    public int distance = 16;//定义坦克移动一次的距离
    protected boolean flag;//碰撞发生旗帜
    protected long nowTime;

    public Tank(int x, int y) {
        super(x, y);
    }

    public Tank() {
    }

    @Override
    public void draw() {

    }
}
