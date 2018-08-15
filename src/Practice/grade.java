package Practice;
import  java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Double num=grade();
        {
            if(num<=100 && num>=90){
                System.out.println("优秀");
            }
            else if(num<=89 && num>=80){
                System.out.println("良");
            }
            else if(num<=79 && num>=70){
                System.out.println("一般");
            }
            else if(num<=69 && num>=60){
                System.out.println("及格");
            }
            else if(num<=59 && num>=0){
                System.out.println("不及格");
            }
        }

    }
    public static double grade(){
        Scanner sc=new Scanner(System.in);
        double score=sc.nextDouble();
        return score;
    }
}
