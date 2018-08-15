package Practice;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day = sc.nextInt();
        boolean vacation = sc.nextBoolean();
        System.out.println(alarmClock(day, vacation));
    }
    public static String alarmClock(int day, boolean vacation)
    {
        String alarm;
        if(vacation)
        {
            if(day >= 1 && day <= 5)
            {
                alarm = "10:00";
            }
            else
            {
                alarm = "false";
            }
        }
        else
        {
            if(day >= 1 && day <= 5)
            {
                alarm = "7:00";
            }
            else
            {
                alarm = "10:00";
            }
        }
        return alarm;
    }
}
