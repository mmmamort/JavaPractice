package Homework.加强班.敖屹06.第九题;

public class Number implements Runnable {
    int count = 0;
    Object sd = new Object();

    @Override
    public void run() {
        synchronized (sd) {
            try {
                count++;
                System.out.println("第" + count + "个人 \t" + Thread.currentThread().getName() + "某人正在通过山洞");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("        \t" + Thread.currentThread().getName() + "某人已经通过山洞");
        }
    }
}
