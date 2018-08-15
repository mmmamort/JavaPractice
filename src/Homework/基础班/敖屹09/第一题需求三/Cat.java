package Homework.基础班.敖屹09.第一题需求三;

public class Cat extends Animal {
    public Cat(String color, int legNumber) {
        super(color, legNumber);
    }

    public Cat() {
    }

    public void information() {
        String kind = "猫";
        super.information(kind);
    }

    @Override
    public void eatFood() {
        System.out.print("今天晚上吃鱼干");
    }

    public void catchMouse() {
        System.out.println("现在在抓老鼠。");
    }
}
