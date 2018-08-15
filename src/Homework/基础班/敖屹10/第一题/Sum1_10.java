package Homework.基础班.敖屹10.第一题;

public class Sum1_10 implements Sum {

    @Override
    public int sum() {
        int sum = 0;
        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0 && num % 3 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}
