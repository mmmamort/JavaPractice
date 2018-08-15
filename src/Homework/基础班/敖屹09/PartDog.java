package Homework.基础班.敖屹09;

import Homework.基础班.敖屹10.第五题.需求五.Dog2;
import Homework.基础班.敖屹10.第五题.需求五.Jump;

public class PartDog extends Dog2 implements Jump {
    public PartDog(String name, int age) {
        super(name, age);
    }

    public PartDog() {
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
