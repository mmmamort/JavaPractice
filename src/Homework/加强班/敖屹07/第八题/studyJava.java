package Homework.加强班.敖屹07.第八题;

public class studyJava implements Runnable {

    @Override
    public void run() {
        System.out.println("我需要一个老师");
        try {
            System.out.println(Thread.currentThread().getName() + "准备教我");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教我java，教完后，老师回到了办公室");
    }
}
