package Homework.基础班.敖屹10.第五题.需求三;

public abstract class Animal {
    private String color;
    private int legNum;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegNum() {
        return legNum;
    }

    public void setLegNum(int legNum) {
        this.legNum = legNum;
    }

    public Animal(String color, int legNum) {

        this.color = color;
        this.legNum = legNum;
    }

    public Animal() {

    }

}
