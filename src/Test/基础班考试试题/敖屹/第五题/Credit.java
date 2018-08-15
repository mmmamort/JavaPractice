package Test.基础班考试试题.敖屹.第五题;

public interface Credit {
    void prepaid();

    public default void save() {
        System.out.println("可以存钱");
    }
}
