package Homework.基础班.敖屹10.第五题.需求五;

public abstract class Animal2 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal2(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Animal2() {
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void info();

}
