package Practice.USB模拟;

public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("鼠标开启，O(∩_∩)O");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，O(∩_∩)O");
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
