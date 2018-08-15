package Practice;
import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int lv = sc.nextInt();
        for(int i = 1; i <= lv; i++ )
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("\t"+j+"*"+i+"="+(i * j));
            }
            System.out.println();
        }
    }
}
