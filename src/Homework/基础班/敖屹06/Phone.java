package Homework.基础班.敖屹06;

public class Phone {
    private String brand;
    private int price;

    public String getBrand() {
        return brand;
    }

    public Phone() {
        System.out.println(1111111);
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone(int price) {
        this.price = price;
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(String name) {
        System.out.println("给" + name + "打电话。");
    }

    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信。");
    }

    public void playGame(String gameName) {
        System.out.println("玩" + gameName + "游戏。");
    }
}
