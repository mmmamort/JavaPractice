package Homework.基础班.敖屹10.第五题.需求一;

public class EmploymentTeacher extends Teacher implements Teach {
    public EmploymentTeacher(String name, int age) {
        super(name, age);
    }

    public EmploymentTeacher() {
    }

    @Override

    public void teach() {
        System.out.println("姓名：" + super.getName() + " 年龄：" + super.getAge() + " 教JavaEE");
    }
}
