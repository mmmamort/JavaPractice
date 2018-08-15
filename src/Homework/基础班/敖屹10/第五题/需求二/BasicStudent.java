package Homework.基础班.敖屹10.第五题.需求二;

public class BasicStudent extends Student implements Study {
    public BasicStudent(String name, int age) {
        super(name, age);
    }

    public BasicStudent() {
    }

    @Override
    public void study() {

        System.out.println("姓名：" + super.getName() + " 年龄：" + super.getAge() + " 学JavaSE");
    }
}
