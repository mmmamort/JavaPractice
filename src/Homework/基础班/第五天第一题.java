package Homework.基础班;

import java.util.Arrays;

public class 第五天第一题 {
    public static void main(String[] args) {
        System.out.println("第一题如下：");
        int[] arr1 = {6, 2, 0, 6, 2, 0, 6, 7, 8};
        int num1 = 0, num2 = 0;
        for (int i = arr1.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr1[i] == arr1[j]) {
                    num1++;
                    System.out.println("相同次数"+num1 + "      索引" + i + "与索引" + j);
                    break;
                }
            }
        }
        int[] arr2 = new int[arr1.length - num1];
        for (int k = arr1.length - 1; k > 0; k--) {
            for (num2 = k - 1; num2 >= 0; num2--) {
                if (arr1[k] == arr1[num2]) break;
                if (num2 == 0) break;
            }
/*            if (arr1[i] == arr1[num2]) {
            } else {
                arr2[arr1.length - 1 - num1] = arr1[i];
                num1++;
            }*/
            if (arr1[k] != arr1[num2]) {
                arr2[arr1.length - 1 - num1] = arr1[k];
                num1++;
            }
        }
        arr2[0] = arr1[0];//倒序比较，首元素绝无相同。  若顺序比较，则尾元素无相同。
        System.out.println(Arrays.toString(arr1) + "转化为：" + Arrays.toString(arr2));
    }
}
