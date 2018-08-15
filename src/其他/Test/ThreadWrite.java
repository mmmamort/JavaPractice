package 其他.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ThreadWrite extends Thread {
    private Socket socket;
    String hostName;

    public ThreadWrite() {
    }

    public ThreadWrite(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                hostName = InetAddress.getLocalHost().getHostName();
                //‪C:\\Users\\Eason\\Desktop\\01-交通方式.png
                String output = new Scanner(System.in).next();
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(output));
                BufferedOutputStream bow = new BufferedOutputStream(socket.getOutputStream());
                byte[] bytes = new byte[1024 * 8];
                int len;
                while ((len = bis.read(bytes)) != -1) {
                    bow.write(bytes, 0, len);
                }
                bow.close();
                bis.close();
                System.out.println("传输完成");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
