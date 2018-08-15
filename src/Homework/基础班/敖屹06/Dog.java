package Homework.基础班.敖屹06;

public class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
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
        System.out.println("今天晚上给他吃："+foodName);
    }

    public void action(String action){
        System.out.println(name+"今天没拆家在"+action);
    }
}
