package Practice.网络测试;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            Socket socket = new Socket("192.168.65.24", 9999);
            new ThreadWriter(socket, ip).start();
            new ThreadReader(socket, ip).start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
