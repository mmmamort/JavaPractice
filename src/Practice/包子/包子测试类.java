package Practice.包子;

public class 包子测试类 {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPu bzp = new BaoZiPu(bz);
        ChiHuo ch = new ChiHuo(bz);
        bzp.start();
        ch.start();
    }
}
