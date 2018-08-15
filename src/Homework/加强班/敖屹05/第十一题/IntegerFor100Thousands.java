package Homework.加强班.敖屹05.第十一题;

public class IntegerFor100Thousands extends Thread {
    @Override
    public void run() {
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer a = i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("线程一所花时间：" + (endTime - startTime));
    }
}
