package Homework.加强班.敖屹05.第九题;

public class EvenNumber1To100 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) System.out.println("线程二中1到100的偶数" + i);
        }
    }
}
