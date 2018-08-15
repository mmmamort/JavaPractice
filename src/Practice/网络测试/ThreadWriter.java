package Practice.网络测试;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ThreadWriter extends Thread {

    Socket socket;
    private InetAddress ip;

    public ThreadWriter(Socket socket, InetAddress ip) {
        this.socket = socket;
        this.ip = ip;
    }

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            while (true) {
                String str = sc.next();
                OutputStream os = socket.getOutputStream();
                os.write((ip.getHostName() + "  " + ip.getHostAddress() + "\r\n" + str).getBytes());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
