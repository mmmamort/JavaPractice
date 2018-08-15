package Homework.基础班.敖屹10.第四题;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    @Override
    public String eat() {
        return " 吃果果";
    }

    @Override
    public String sleep() {
        return " 24点睡觉";
    }

    @Override
    public void info() {
        System.out.println(super.getName() +"在学习" + eat() + sleep());
    }
}
