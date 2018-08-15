package domain;

import tool.DrawUtils;

import java.io.IOException;

public class Grass extends Element {
    private int blood = 3; //blood血量
    private String srcPath = "BattleCity\\res\\img\\grass.gif";//图片地址

    public Grass(int x, int y) {
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
        return 2;
    }
}
