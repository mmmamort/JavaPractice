package Homework.加强班.敖屹11.扩展第三题.服务端;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            Socket socket = serverSocket.accept();
            File file = new File("G:\\Java\\src\\Homework\\加强班\\敖屹11\\扩展第三题\\服务端");
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            byte[] bytes = new byte[1024 * 8];
            int len = is.read(bytes);
            String fileName = new String(bytes, 0, len);
            //判断文件名回写信息。
            for (File file1 : file.listFiles()) {
                if (file1.getName().equals(fileName)) {
                    os.write("文件已存在".getBytes());
                    return;
                }
            }
            os.write("文件不存在".getBytes());
            //读取上传文件
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file + "\\" + fileName));
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            //回写信息
            os.write("上传成功".getBytes());
            os.flush();
            socket.shutdownOutput();
            bos.close();
            bis.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
