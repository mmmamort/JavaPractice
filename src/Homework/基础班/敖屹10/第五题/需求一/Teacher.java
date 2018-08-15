package Homework.基础班.敖屹10.第五题.需求一;

public abstract class Teacher {
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

    public Teacher(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Teacher() {

    }

}
