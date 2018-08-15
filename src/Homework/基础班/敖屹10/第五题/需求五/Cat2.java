package Homework.基础班.敖屹10.第五题.需求五;

public class Cat2 extends Animal2 {
    public Cat2(String name, int age) {
        super(name, age);
    }

    public Cat2() {
    }

    @Override
    public void eat() {
        System.out.print(" 吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println(" 22点睡觉");
    }

    @Override
    public void info() {
        System.out.print("猫叫" + super.getName() + super.getAge() + "岁");
        eat();
        sleep();
    }
}
