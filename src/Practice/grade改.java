package Practice;
import java.util.Scanner;
public class grade改
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=(int)sc.nextDouble();
        switch (score / 10)
        {
            case 10 :
            case 9 :
                System.out.println("优秀");
                break;
            case 8 :
                System.out.println("良好");
                break;
            case 7 :
                System.out.println("一般");
                break;
            case 6 :
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}