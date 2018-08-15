package domain;

import gameInterface.Blockable;
import gameInterface.Tools;
import tool.DrawUtils;

import java.io.IOException;

public class Star extends Element implements Tools, Blockable {
    private String srcPath = "BattleCity\\res\\img\\star.gif";//图片地址

    public Star(int x, int y) {
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

    @Override
    public int getOrder() {
        return 0;
    }
}
