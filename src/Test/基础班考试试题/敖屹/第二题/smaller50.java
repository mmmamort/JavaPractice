package Test.基础班考试试题.敖屹.第二题;

import java.util.Arrays;
import java.util.Random;

public class smaller50 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(91) + 10;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 50) arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
