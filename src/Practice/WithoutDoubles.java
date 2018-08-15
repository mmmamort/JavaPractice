package Practice;

import java.util.Scanner;

public class WithoutDoubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        boolean noDoubles = sc.nextBoolean();
        System.out.println(withoutDoubles(a, b, noDoubles));
    }

    public static int withoutDoubles(int a, int b, boolean noDoubles) {
        if (!noDoubles) {
            if (a == b && a <= 6 && a >= 1)
                return a + b;
            else return 0;
        } else {
            if (a != b && a <= 6 && a >= 1 && b <= 6 && b >= 1)
                return a + b;
            else if (a == b && a < 6 && a >= 1)
                return a + b + 1;
            else if (a == b && a == 6)
                return a + 1;
            else
                return 0;
        }
    }

}
