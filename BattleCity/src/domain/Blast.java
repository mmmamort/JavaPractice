package domain;

import gameInterface.Destroyable;
import tool.DrawUtils;

import java.io.IOException;

public class Blast extends Element implements Destroyable {
    private String[] srcList = {"BattleCity\\res\\img\\blast_1.gif", "BattleCity\\res\\img\\blast_2.gif", "BattleCity\\res\\img\\blast_3.gif", "BattleCity\\res\\img\\blast_4.gif", "BattleCity\\res\\img\\blast_5.gif", "BattleCity\\res\\img\\blast_6.gif", "BattleCity\\res\\img\\blast_7.gif", "BattleCity\\res\\img\\blast_8.gif"};
    private int len = 3;
    private int index;
    private boolean flag = false;//爆炸图片销毁状态旗帜
    private long lastTime = 0;
    private long nowTime;

    public Blast(int x, int y, int width, int height, int blood, Element element) {
        try {
            int[] size = DrawUtils.getSize("BattleCity\\res\\img\\blast_1.gif");
            this.width = size[0];
            this.height = size[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = x + (width - this.width) / 2;
        this.y = y + (height - this.height) / 2;
        if (blood < 1 && element instanceof Tank) len = srcList.length;
    }

    public void draw() {
        try {
            if (index > len - 1) {
                index = 0;
                flag = true;
            }
            nowTime = System.currentTimeMillis();
            if (index < len) DrawUtils.draw(srcList[index], x, y);
            if (nowTime - lastTime > 100) {
                index++;
                lastTime = nowTime;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isDestroy() {
        return flag;
    }

}
