package Homework.基础班.敖屹10.第五题.需求五;

public class Dog2 extends Animal2 {
    public Dog2(String name, int age) {
        super(name, age);
    }

    public Dog2() {
    }

    @Override
    public void eat() {
        System.out.print(" 吃肉");
    }

    @Override
    public void sleep() {
        System.out.println(" 21点睡觉");
    }

    @Override
    public void info() {
        System.out.print("狗叫" + super.getName() + super.getAge() + "岁");
        eat();
        sleep();

    }

}
