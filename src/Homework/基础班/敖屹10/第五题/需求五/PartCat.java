package Homework.基础班.敖屹10.第五题.需求五;

public class PartCat extends Cat2 implements Jump {
    public PartCat(String name, int age) {
        super(name, age);
    }

    public PartCat() {
    }

    @Override
    public void info() {
        super.info();
        System.out.println(jump());
    }

    @Override
    public String jump() {
        return "会跳高";
    }
}
