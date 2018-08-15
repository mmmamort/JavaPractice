package Homework.加强班.敖屹05.第十题;

public class Player {
    private String name;
    private int bloodNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBloodNumber() {
        return bloodNumber;
    }

    public void setBloodNumber(int bloodNumber) {
        this.bloodNumber = bloodNumber;
    }

    public Player() {

    }

    public Player(String name, int bloodNumber) {

        this.name = name;
        this.bloodNumber = bloodNumber;
    }

    public void checkBloodNumber() {

        if (bloodNumber < 0) {
            System.out.println("兄dei!~你对手开挂了吧，血量到负数了，请上传数据。");
            throw new BloodNumberOutOfBoundsExcepution();
        }
    }
}
