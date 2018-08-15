package 其他;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test2 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
