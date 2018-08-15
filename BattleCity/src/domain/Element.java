package domain;

public abstract class Element {
    protected int x;//x坐标
    protected int y;//y坐标
    protected int width; //width宽
    protected int height;//height高

    public Element(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Element() {
    }

    public abstract void draw();

    public int getOrder() {
        return 0;
    }
}
