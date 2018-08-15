package Test.基础班考试测试题;

public interface Bluetooth {
    void btFunction();

    public default void connecting() {
        System.out.println("可以连接蓝牙");
    }
}
