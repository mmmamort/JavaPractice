package Homework.加强班.敖屹11.扩展第二题.客户端;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 6666);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\Java\\src\\Homework\\加强班\\敖屹11\\扩展第二题\\客户端\\01-交通方式.png"));
            OutputStream os = socket.getOutputStream();
            int len;
            byte[] bytes = new byte[1024 * 8];
            while ((len = bis.read(bytes)) != -1) os.write(bytes, 0, len);
            os.close();
            bis.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
