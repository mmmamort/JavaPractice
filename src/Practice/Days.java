package Practice;
import java.util.Scanner;

public class Days {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();
        int days=0;
        boolean include=true;
        switch (month){
            case 12:days += 30;
            case 11:days += 31;
            case 10:days += 30;
            case 9:days += 31;
            case 8:days += 31;
            case 7:days += 30;
            case 6:days += 31;
            case 5:days += 30;
            case 4:days += 31;
            case 3:if(year%4==0) {days += 29;}
                    else {days += 28;}
            case 2:days += 31;
            case 1:days += day;
        }
        System.out.println(""+year+"年"+month+"月"+day+"日是"+year+"的第"+days+"天。");
    }
}
