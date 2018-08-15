package Practice.USB模拟;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
        Usb usb1 = new Mouse();
        computer.useUsb(usb1);
        Usb usb2 = new KeyBoard();
        computer.useUsb(usb2);
        computer.stop();
    }
}
