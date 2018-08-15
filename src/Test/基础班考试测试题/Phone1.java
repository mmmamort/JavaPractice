package Test.基础班考试测试题;

public abstract class Phone1 {
    private String name;

    public Phone1(String name) {
        this.name = name;
    }

    public Phone1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void playMusic(Song song);
}
