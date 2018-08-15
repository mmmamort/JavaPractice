package Practice;
import java.util.Scanner;

public class BlueTicket {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
        System.out.println(blueTicket(num1, num2, num3));
    }
    public static int blueTicket(int a, int b, int c)
    {
        int ab = a + b, ac = a + c, bc = b + c;
        if(ab == 10 || ac == 10 || bc == 10)
        {
            return 10;
        }
        else if(ab - bc == 10 || ab - ac == 10)
        {
            return 5;
        }
        else
        {
            return 0;
        }
    }
}