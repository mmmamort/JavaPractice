package Homework.加强班.敖屹05.第八题;

import Homework.加强班.敖屹05.第九题.ScoreOutOfBoundsException;

public class Student {
    private int code;
    private String name;
    private int score;

    public Student() {

    }

    public Student(int code, String name, int score) {

        this.code = code;
        this.name = name;
        this.score = score;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public void checkScore()  {
        if (score < 0) {
            System.out.println("成绩录入有误，成绩为负数");
            throw new ScoreOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "学生学号：" + code + " 姓名：" + name + " 分数：" + score;
    }
}
