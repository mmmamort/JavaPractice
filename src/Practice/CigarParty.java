package Practice;

import java.util.Scanner;

public class CigarParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean weekend = sc.nextBoolean();
        System.out.println(cigarParty(number, weekend));
    }

    public static boolean cigarParty(int number, boolean weekend) {
        if (weekend) {
            if (number >= 40)
                return true;
            else
                return false;
        } else {
            if (number >= 40 && number <= 60)
                return true;
            else
                return false;
        }
    }
}
