package Homework.加强班.敖屹06.第三题;

public class Zi1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程名：" + Thread.currentThread().getName());
        }
    }
}
