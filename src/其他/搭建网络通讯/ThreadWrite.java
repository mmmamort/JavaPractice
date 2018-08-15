package 其他.搭建网络通讯;

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
                String output = new Scanner(System.in).next();
                OutputStream os = socket.getOutputStream();
                //设置传输文件用关键字
                if (output.startsWith("upload:")) {
                    //暂时设定一个固定的传入文件"upload:C:\\Users\\Eason\\Desktop\\Student.txt"
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(output.substring(7)));
                    BufferedOutputStream bow = new BufferedOutputStream(os);
                    byte[] bytes = new byte[1024 * 8];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        bow.write(bytes, 0, len);
                    }
                    bow.close();
                    bis.close();
                    System.out.println("传输完成");
                } else {
                    //对字符串进行封装，以便接收端区分字符串与文件
                    os.write(("0x11901" + hostName + "\n" + output + "0x11901").getBytes());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
