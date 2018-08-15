package Homework.加强班.敖屹05.第十一题;

public class StringFor100Thousands2 extends Thread {
    @Override
    public void run() {
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String c = "黑马程序员" + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("线程三所花时间：" + (endTime - startTime));
    }
}
