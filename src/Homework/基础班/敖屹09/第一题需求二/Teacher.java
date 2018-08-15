package Homework.基础班.敖屹09.第一题需求二;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void prelection() {
        System.out.println("姓名：" + super.getName() + " 年龄：" + super.getAge() + " 正在讲课。");
    }
}
