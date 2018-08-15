package Homework.加强班.敖屹06.第六题;

public class 第六题 {
    public static void main(String[] args) {
        System.out.println("\n第六题");
        {
            Thread zi = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        System.out.println("子线程执行" + i);
                    }
                }
            };
            zi.start();
            for (int j = 0; j < 20; j++) {
                System.out.println("主线程执行" + j);
            }
        }
    }
}
