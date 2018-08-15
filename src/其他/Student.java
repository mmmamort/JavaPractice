package 其他;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private transient int age;
    private int score;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {

    }

    public Student(String name, int age, int score) {

        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "，年龄：" + age + "，成绩：" + score;
    }
}
