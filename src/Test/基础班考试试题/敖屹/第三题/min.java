package Test.基础班考试试题.敖屹.第三题;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        //找最小值
        for (int j = 1; j < arr.length; j++) {
            min = Math.min(arr[j], min);
        }
        //找与最小值相同的索引
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == min) {
                System.out.println("最小值：" + min + "------最小值下标：" + k);
            }
        }
    }
}
