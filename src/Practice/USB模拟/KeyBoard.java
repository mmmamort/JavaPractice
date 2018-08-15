package Practice.USB模拟;

public class KeyBoard implements Usb {
    @Override
    public void open() {
        System.out.println("键盘开启，O(∩_∩)O");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，O(∩_∩)O");
    }

    public void knock() {
        System.out.println("敲击键盘");
    }
}
