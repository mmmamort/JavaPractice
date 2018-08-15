package Practice;

import java.util.Scanner;

public class CaughtSpeeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        boolean isBirthday = sc.nextBoolean();
        System.out.println(caughtSpeeding(speed, isBirthday));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65 && speed >= 0) {
                return 0;
            } else if (speed < 86 && speed > 65) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 60 && speed >= 0) {
                return 0;
            } else if (speed < 81 && speed > 60) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
