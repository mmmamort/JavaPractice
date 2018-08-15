package 其他.搭建网络通讯;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ThreadRead extends Thread {
    private Socket socket;

    public ThreadRead(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                InputStream is = socket.getInputStream();
                int len;
                byte[] bytes = new byte[1024];
                while ((len = is.read(bytes)) != -1) System.out.println(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
