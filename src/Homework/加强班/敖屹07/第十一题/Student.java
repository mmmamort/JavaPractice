package Homework.加强班.敖屹07.第十一题;

public class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {

        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学生" + "姓名：" + name + " 分数：" + score;
    }
}
