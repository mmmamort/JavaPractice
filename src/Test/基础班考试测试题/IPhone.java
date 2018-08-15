package Test.基础班考试测试题;

public class IPhone extends Phone1 implements Bluetooth {
    public IPhone(String name) {
        super(name);
    }

    public IPhone() {
    }

    @Override
    public void btFunction() {
        System.out.println("支持蓝牙功能");
    }

    @Override
    public void playMusic(Song song) {
        System.out.println(super.getName() + "手机正在播放" + song.getSinger() + "唱的" + song.getName());
    }
}
