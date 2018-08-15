package Homework.加强班.敖屹06.第八题;

public class Thread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程二第" + i + "次");
        }
    }
}
