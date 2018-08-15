package Homework.基础班.敖屹09.第一题需求三;

public abstract class Animal {
    private String color;
    private int legNumber;
    private String kind;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    public Animal(String color, int legNumber) {

        this.color = color;
        this.legNumber = legNumber;
    }

    public Animal() {

    }

    public void information(String kind) {
        this.kind = kind;
        System.out.println("我家的" + kind + "是" + color + "有" + legNumber + "条腿。");
    }

    public abstract void eatFood();
}
