package Homework.加强班.敖屹07.第六题;

public class 第六题 {
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {
        new 第六题().method();
    }

    public void method() {
        //插入的代码
        Runnable a = new Runnable() {
            @Override
            public void run() {
                for (int i = start; i < end + 1; i++) {
                    System.out.println(i);
                }
            }
        };//插入代码结束
        Thread t = new Thread(a);
        t.start();
    }
}