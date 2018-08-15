package Homework.加强班.敖屹11.扩展第三题.客户端;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 7777);
            File file = new File("G:\\Java\\src\\Homework\\加强班\\敖屹11\\扩展第三题\\客户端\\01-Java语言之父.jpg");
            if (file.length() > 2097152) {
                System.out.println("文件超过2M");
                return;
            }
            if (!file.getName().endsWith(".jpg")) {
                System.out.println("文件非.jpg格式");
                return;
            }
            OutputStream os = socket.getOutputStream();
            os.write(file.getName().getBytes());
            //读取回写信息
            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024 * 8];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));
            //上传文件
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            while ((len = bis.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            socket.shutdownOutput();
            //读取回写信息
            while ((len = is.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            bis.close();
            is.close();
        } catch (
                IOException e)

        {
            e.printStackTrace();
        }
    }
}
