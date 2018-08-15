package Homework.加强班.敖屹06.第三题;

public class Zi extends Thread {
    public Zi(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程名：" + Thread.currentThread().getName());
        }
    }
}
