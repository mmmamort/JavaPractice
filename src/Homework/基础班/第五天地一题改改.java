package Homework.基础班;

import java.util.ArrayList;

public class 第五天地一题改改 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {6, 2, 9, 6, 0, 2, 6, 7, 0};
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) continue;
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
