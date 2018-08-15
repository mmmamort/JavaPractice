package Practice.包子;

public class BaoZiPu extends Thread {
    int bzKind = 0;
    BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺正在做包子");
                if (bzKind % 2 == 0) {
                    bz.pi = "荞麦皮";
                    bz.xian = "牛肉";
                } else {
                    bz.pi = "小麦皮";
                    bz.xian = "猪肉";
                }
                System.out.println(bz.pi + bz.xian + "包子做好了");
                bz.flag = true;
                bz.notify();
            }
        }
    }
}
