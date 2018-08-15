package domain;

import gameInterface.Blockable;
import gameInterface.Destroyable;
import gameInterface.Hitable;
import tool.DrawUtils;
import tool.SoundUtils;

import java.io.IOException;

public class Steel extends Element implements Blockable, Hitable, Destroyable {
    private int blood = 1; //blood血量
    public boolean breakableFlag = false;
    private String srcPath = "BattleCity\\res\\img\\steel.gif";//图片地址

    public Steel(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            int[] size = DrawUtils.getSize(srcPath);
            this.width = size[0];
            this.height = size[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw() {
        try {
            DrawUtils.draw(srcPath, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Blast showAttack() {
        if (breakableFlag) blood--;
        return new Blast(x, y, width, height, blood, this);
    }

    @Override
    public boolean isDestroy() {
        if (blood > 0) return false;
        else return true;
    }
}
