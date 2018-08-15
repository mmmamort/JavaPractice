package Practice;
import java.util.Scanner;
//需求：编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大。
public class caps {
    public static void main(String[] args) {
        Scanner ch_in = new Scanner(System.in);
        char ch = ch_in.next().charAt(0);
        if (ch <= 90 && ch >= 65) {
            ch = (char) (ch + 32);
            System.out.println(ch);
        } else if (ch <= 122 && ch >= 97) {
            ch = (char) (ch - 32);
            System.out.println(ch);
        }
        else {}
    }
}