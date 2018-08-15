package Practice.USB模拟;

public class Computer {
    public void run() {
        System.out.println("电脑运行");
    }

    public void useUsb(Usb usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard kb = (KeyBoard) usb;
            kb.knock();
        }
        usb.close();
    }

    public void stop() {
        System.out.println("电脑停止");
    }
}
