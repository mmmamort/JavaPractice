package Test.基础班考试测试题;

public class Phone {
    private String brand;
    private int power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Phone(String brand, int power) {

        this.brand = brand;
        this.power = power;
    }

    public Phone() {

    }

    public void checkPower() {
        if (power >= 0 && power < 20) {
            System.out.println("电量过低，请充电");
        }
    }
}
