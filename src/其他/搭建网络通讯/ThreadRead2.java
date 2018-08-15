package 其他.搭建网络通讯;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

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
                BufferedOutputStream bow = new BufferedOutputStream(new FileOutputStream("G:\\a.txt"));
                int len;
                byte[] bytes = new byte[1024 * 8];
                while ((len = bis.read(bytes)) != -1) {
                    String s = new String(bytes, 0, len);
                    //对读取到的字符串进行识别。
                    if (s.startsWith("0x11901") && s.endsWith("0x11901")) {
                        //是字符串就进行解封打印
                        System.out.println(s.substring(7, (s.length() - 7)));
                    } else {
                        //不是字符串，进行读写操作
                        bow.write(bytes, 0, len);
                        System.out.println("接受完成");
                    }
                }
                bow.close();
                bis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
