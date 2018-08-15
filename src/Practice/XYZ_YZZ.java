package Practice;
import java.util.Scanner;
// XYZ+YZZ=532     2Z+10(Y+Z)+100(X+Y)=532; Z<5?  Z=1 Y=2 X=3 TRUE      Z>=5 Z=6 Y=6 X=-1 FALSE
public class XYZ_YZZ {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        double  y, z;
        y=ySml5_zSml5(sum);
        if(y >= 0 && y <= 10)
        {
            System.out.println(""+y+" "+zSml5(sum));
        }
        y=ySml5_zBig5(sum);
        if(y >= 0 && y <= 10)
        {
            System.out.println(""+y+" "+zBig5(sum));
        }
        y=yBig5_zSml5(sum);
        if(y >= 0 && y <= 10)
        {
            System.out.println(""+y+" "+zSml5(sum));
        }
        y=yBig5_zBig5(sum);
        if(y >= 0 && y <= 10)
        {
            System.out.println(""+y+" "+zBig5(sum));
        }
    }
    public static double zBig5 (double sum)   //x大于5
    {
        double z;
        z = (double) ( ( sum % 10 +10 ) / 2 );
        return z;
    }
    public static double zSml5 (double sum)
    {
        double z;
        z = (double) ( sum % 10 / 2 );
        return z;
    }
    public static double ySml5_zSml5 (double sum )
    {
        double y;
        y = (double) ( sum / 10 % 10 - zSml5(sum) );
        return y;
    }
    public static double ySml5_zBig5 (double sum )
    {
        double y;
        y = (double) ( sum / 10 % 10 -1 - zBig5(sum) );
        return y;
    }
    public static double yBig5_zSml5 (double sum )
    {
        double y;
        y = (double) ( sum / 10 % 10 + 9 - zSml5(sum) );
        return y;
    }
    public static double yBig5_zBig5 (double sum )
    {
        double y;
        y = (double) ( sum / 10 % 10 + 9 - zBig5(sum) );
        return y;
    }
}

