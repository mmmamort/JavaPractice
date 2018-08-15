package Practice.网络测试;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ThreadReader extends Thread {

    Socket socket;
    private InetAddress ip;

    public ThreadReader(Socket socket, InetAddress ip) {
        this.socket = socket;
        this.ip = ip;
    }

    @Override
    public void run() {
        try {
            while (true) {
                InputStream is = socket.getInputStream();
                byte[] b = new byte[1024];
                int len = is.read(b);
                String str = new String(b, 0, len);
                if (!socket.getInetAddress().getHostAddress().equals(ip.getHostAddress())) {
                    System.out.println(str);
                } else System.out.println("已回复");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
