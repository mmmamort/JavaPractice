package Homework.基础班.敖屹10.第五题.需求三;

public class Dog1 extends Animal implements AnimalEat {
    public Dog1(String color, int legNum) {
        super(color, legNum);
    }

    public Dog1() {
    }

    @Override
    public void eat() {
        System.out.println("晚上吃骨头");
    }

    @Override
    public void information() {
        System.out.println("狗是" + super.getColor() + "的，有" + super.getLegNum() + "条腿。");
    }

    public void lookHome() {
        System.out.println("现在在看家");
    }
}
