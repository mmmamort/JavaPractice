package 其他.搭建网络通讯;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.23.35", 2694);
        new ThreadWrite(socket).start();
        new ThreadRead2(socket).start();
    }
}
