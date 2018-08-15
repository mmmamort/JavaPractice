package 其他;

import Practice.网络测试.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


//G:\Java\web
public class webTest {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6666);
            while (true) {
                Socket socket = server.accept();
                new Thread(new webServer(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class webServer extends Thread {
        private Socket socket;

        public webServer(Socket socket) {
            this.socket = socket;
        }

        public webServer() {
        }

        public Socket getSocket() {
            return socket;
        }

        public void setSocket(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String path = br.readLine().split(" ")[1].substring(1);
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
                OutputStream os = socket.getOutputStream();
                int len;
                byte[] bytes = new byte[1024 * 8];
                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                os.write("Content‐Type:text/html\r\n".getBytes());
                os.write("\r\n".getBytes());
                while ((len = bis.read(bytes)) != -1) {
                    os.write(bytes, 0, len);
                }
                os.close();
                bis.close();
                br.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
