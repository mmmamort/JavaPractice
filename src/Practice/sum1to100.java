package Practice;
public class sum1to100 {
    public static void main(String[] args) {
        int i = 1, num1 = 0, num2 = 0;
        while (i <= 100) {
            num1 += i;
            i++;
        }
        System.out.println("1-100的和为：" + num1);
        for(int j=1; j <= 100; j++)
        {
            if(j % 2 == 0){
                num2 += j;
            }
        }
        System.out.println("1-100的偶数和为：" + num2);
    }
}
