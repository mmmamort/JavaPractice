package Practice.包子;

public class ChiHuo extends Thread {
    BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (!bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货在吃" + bz.pi + bz.xian + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
