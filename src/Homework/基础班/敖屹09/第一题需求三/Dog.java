package Homework.基础班.敖屹09.第一题需求三;

public class Dog extends Animal {
    public Dog(String color, int legNumber) {
        super(color, legNumber);
    }

    public Dog() {
    }

    public void information() {
        String kind = "狗";
        super.information(kind);
    }

    @Override
    public void eatFood() {
        System.out.print("今天晚上啃骨头");
    }

    public void lookHome() {
        System.out.println("现在看家。");
    }
}
