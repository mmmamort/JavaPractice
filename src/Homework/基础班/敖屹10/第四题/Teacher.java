package Homework.基础班.敖屹10.第四题;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    @Override
    public String eat() {
        return " 吃大果果";
    }

    @Override
    public String sleep() {
        return " 23点睡觉";
    }

    @Override
    public void info() {
        System.out.println(super.getName() + "在上课" + eat() + sleep());
    }
}
