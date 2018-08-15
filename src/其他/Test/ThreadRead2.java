package 其他.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadRead2 extends Thread {
    private Socket socket;

    public ThreadRead2(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                //暂时设定一个固定的输出文件
                BufferedOutputStream bow = new BufferedOutputStream(new FileOutputStream("G:\\" + System.currentTimeMillis() + ".png"));
                int len;
                byte[] bytes = new byte[1024 * 8];
                while ((len = bis.read(bytes)) != -1) {
                    String s = new String(bytes, 0, len);
                    bow.write(bytes, 0, len);
                }
                bow.close();
                bis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
