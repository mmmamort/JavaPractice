package Homework.基础班.敖屹10.第四题;

public class PartStudent extends Student implements Smoke, Drink {
    public PartStudent(String name, int age) {
        super(name, age);
    }

    public PartStudent() {
    }

    @Override
    public void info() {
        super.info();
        System.out.println(smoke() + " " + drink());
    }

    @Override
    public String smoke() {
        return "会抽烟";
    }

    @Override
    public String drink() {
        return "会喝酒";
    }
}
