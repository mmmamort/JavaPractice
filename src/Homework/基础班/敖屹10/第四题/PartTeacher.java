package Homework.基础班.敖屹10.第四题;

public class PartTeacher extends Teacher implements Smoke {
    public PartTeacher(String name, int age) {
        super(name, age);
    }

    public PartTeacher() {
    }

    @Override
    public void info() {
        super.info();
        System.out.println(smoke());
    }

    @Override
    public String smoke() {
        return "会抽烟";
    }
}
