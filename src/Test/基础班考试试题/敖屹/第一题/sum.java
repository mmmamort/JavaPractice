package Test.基础班考试试题.敖屹.第一题;

public class sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println("1-100中能被2整除但不能被3整除的数的和：" + sum);
    }
}
