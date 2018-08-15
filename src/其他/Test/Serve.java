package 其他.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2694);
        while (true) {
            Socket socket = server.accept();
            new ThreadWrite(socket).start();
            new ThreadRead2(socket).start();
        }
    }
}
