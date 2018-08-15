package Homework.基础班.敖屹09.第一题需求二;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("姓名：" + super.getName() + " 年龄：" + super.getAge() + " 正在学习。");
    }
}
