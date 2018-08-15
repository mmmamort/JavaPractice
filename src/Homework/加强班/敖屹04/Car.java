package Homework.加强班.敖屹04;

import java.util.Objects;

public class Car {
    private String brand;
    private String manufacturer;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car() {

    }

    public Car(String brand, String manufacturer) {

        this.brand = brand;
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand, manufacturer);
    }

    @Override
    public String toString() {
        return "品牌：" + brand +
                " 制造商：" + manufacturer;
    }
}
