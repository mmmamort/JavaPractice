package Homework.基础班.敖屹06;

public class Student {
    private int chineseScore, mathScore, englishScore;

    public Student() {
    }

    public Student(int chineseScore, int mathScore, int englishScore) {
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }


    public int getSum() {
        return chineseScore + mathScore + englishScore;
    }
}