package Homework.基础班.敖屹10.第三题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxNum implements Max {
    @Override
    public int[] setArr() {
        System.out.println("请输入5个整数");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    @Override
    public void maxNum(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max) {
                list.add(j);
            }
        }
        System.out.println(Arrays.toString(arr) + "最大值为：" + max);
        System.out.print("最大值索引为：");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(" " + list.get(j));
        }
        System.out.println();

    }
}


