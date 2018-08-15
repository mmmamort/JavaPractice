package Homework.基础班;

import java.util.ArrayList;

public class 第五天第一题改 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = {6, 2, 9, 6, 0, 2, 6, 7, 0};
        boolean flag = false;
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (arr[i] == list.get(j)) {
                    flag = false;
                    break;
                } else flag = true;
            }
            if (flag == true) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
