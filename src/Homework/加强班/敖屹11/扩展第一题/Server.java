package Homework.加强班.敖屹11.扩展第一题;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8002);
            Socket socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();
            os.write("hello world".getBytes());
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
