package Practice;
import java.util.Scanner;

public class NumDigit {
    public static void main(String[] args) {
        Scanner ipt=new Scanner(System.in);
        long num=ipt.nextLong();
        long number=num;
        int i=1;
        while(num>=10){
            num/=10;
            i++;
        }
        System.out.println("数字"+number+"是"+i+"位数。");

    }
}