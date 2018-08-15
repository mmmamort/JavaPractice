package Practice;
import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),num1,num10,num100;
        if (num >= 0 && num <= 999) {
            num1=num%10;num10=num%100/10;num100=num/100;
            System.out.println("个位为"+num1+" 十位为"+num10+" 百位为"+num100);
        }
        else {}
    }
}
