package Homework.加强班.敖屹11.扩展第二题.服务端;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\Java\\src\\Homework\\加强班\\敖屹11\\扩展第二题\\服务端\\copy.png"));
            int len;
            byte[] bytes = new byte[1024 * 8];
            while ((len = is.read(bytes)) != -1) bos.write(bytes, 0, len);
            bos.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
