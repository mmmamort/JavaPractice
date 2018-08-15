package Homework.基础班.敖屹10.第五题.需求三;

public class Cat1 extends Animal implements AnimalEat {
    public Cat1(String color, int legNum) {
        super(color, legNum);
    }

    public Cat1() {
    }

    @Override
    public void eat() {
        System.out.println("晚上吃小鱼");
    }

    @Override
    public void information() {
        System.out.println("猫是" + super.getColor() + "的，有" + super.getLegNum() + "条腿。");
    }

    public void catchMouse() {
        System.out.println("现在在抓老鼠");
    }
}
