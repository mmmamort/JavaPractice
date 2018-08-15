package Homework.基础班.敖屹09.第一题需求一;

public class Manager extends Staff {
    private int salary;

    public Manager() {
    }

    public Manager(String name, int number, int laborage, int salary) {
        super(name, number, laborage);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("项目经理：");
        super.work(super.getName(), super.getNumber(), super.getLaborage());
        System.out.println("奖金：" + salary);
    }
}
