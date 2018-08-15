package Homework.基础班.敖屹09.第一题需求一;

public class Staff {
    private String name;
    private int number, laborage, salary;

    public Staff() {
    }

    public Staff(String name, int number, int laborage) {
        this.name = name;
        this.number = number;
        this.laborage = laborage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLaborage() {
        return laborage;
    }

    public void setLaborage(int laborage) {
        this.laborage = laborage;
    }

    public void work(String name, int number, int laborage) {
        this.name = name;
        this.number = number;
        System.out.println("姓名：" + name + " 工号：" + number + " 工资：" + laborage);
    }
}
