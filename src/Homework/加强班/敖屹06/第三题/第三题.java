package Homework.加强班.敖屹06.第三题;

public class 第三题 {
    public static void main(String[] args) {
        System.out.println("\n第三题");
        {
            Zi name1 = new Zi("Thread子类");
            Zi1 r = new Zi1();
            Thread name2 = new Thread(r, "Runnable实现类");
            name1.start();
            name2.start();
            for (int i = 0; i < 10; i++) {
                System.out.println("主线程名：" + Thread.currentThread().getName());
            }
        }
    }
}
