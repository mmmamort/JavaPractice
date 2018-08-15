package Homework.基础班.敖屹06;

public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void eatFood(String foodName) {
        System.out.println("我看见" + name + "在吃" + foodName);
    }

    public void action(String actionName){
        System.out.println(name+"在"+actionName);
    }
}
