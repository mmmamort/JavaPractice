package Homework.基础班.敖屹09.第一题需求一;

public class Programmer extends Staff {
    public Programmer() {
    }

    public Programmer(String name, int number, int laborage) {
        super(name, number, laborage);
    }

    public void work() {
        System.out.println("程序员：");
        super.work(super.getName(), super.getNumber(), super.getLaborage());
    }
}
