package Homework.基础班;

import java.util.Arrays;

public class 敖屹05 {
    public static void main(String[] args) {
        System.out.println("第一题如下：");
        int[] arr1 = {6, 2, 9, 6, 1, 2, 6, 7, 8};
        int num = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = arr1.length - 1; j > i; j--) {
                if (arr1[i] == arr1[j]) {
                    arr1[j] = 0;
                    num++;
                }
            }
        }
        int[] arr2 = new int[num];
        for (int l = arr1.length - 1; l >= 0; l--) {
            if (arr1[l] != 0) {
                arr2[num - 1] = arr1[l];
                num--;
            }
        }
        System.out.println("最终结果为：" + Arrays.toString(arr2));

        System.out.println("\n第二题如下：");
        int[] arr3 = {6, 2, 9, 15, 1, 5, 20, 7, 18};
        int max = arr3[0], mix = arr3[0], num1, num2, num3;
        for (num1 = 0, num2 = 0, num3 = 0; num1 < arr3.length; num1++) {
            if (arr3[num1] > max) {
                max = arr3[num1];
                num2 = num1;
            }
            if (arr3[num1] < mix) {
                mix = arr3[num1];
                num3 = num1;
            }
        }
        arr3[num2] = arr3[arr3.length - 1];
        arr3[arr3.length - 1] = max;
        arr3[num3] = arr3[0];
        arr3[0] = mix;
        System.out.println("最终结果为：" + Arrays.toString(arr3));

        System.out.println("\n第三题如下：");
        int[] arr_a = {102, 2, 3, 4}, arr_b = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr_a) + "与" + Arrays.toString(arr_b) + "元素和最大的为：" + Arrays.toString(compareArrays(arr_a, arr_b)));

        System.out.println("\n第四题如下：");
        int[] arr4 = {7, 8, 2, 3}, arr5 = {36, 8, 9, 2, 1, 5, 3};
        System.out.println(Arrays.toString(arr4) + "与" + Arrays.toString(arr5) + "的首元素或尾元素是否相同：" + equal_BeginningToEnding(arr4, arr5));

        System.out.println("\n第五题如下：");
        int[] arr6 = {2, 2, 3, 4, 5, 6, 8};
        System.out.println(Arrays.toString(arr6) + "是否包含数字“2”两次或数字“3”两次：" + timesOfTwoAndThree(arr6));

        System.out.println("\n第六题如下：");
        int[] arr7 = {6, 3, 5, 7, 4, 2, 5};
        System.out.println(Arrays.toString(arr7) + "中首元素或尾元素是否为“6”：" + sixIsBeginningOrEnding(arr7));

        System.out.println("\n第七题如下：");
        int[] arr8 = {2, 2, 2, 2, 2, 2, 2, 3};
        System.out.println(Arrays.toString(arr8) + "运算后最终结果如下：" + Arrays.toString(threeBeZero(arr8)));

        System.out.println("\n没有第八题。");

        System.out.println("\n第九题如下：");
        int[] arr9 = {3, 2, 1};
        System.out.println(Arrays.toString(arr9) + "运算后最终结果如下：" + Arrays.toString(newArray(arr9)));

        System.out.println("\n第十题如下：");
        int[] arr10 = {1, 0, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr10) + "是否包含“2”或“3”：" + inclusion2Or3(arr10));

        System.out.println("\n第十一题如下：");
        int[] arr11 = {1, 3};
        System.out.println(Arrays.toString(arr11) + "是否不包含“2”或“3”：" + exclusion2Or3(arr11));

    }

    //第三题的方法：
    public static int[] compareArrays(int[] Arr1, int[] Arr2) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < Arr1.length; i++) {
            sumA += Arr1[i];
        }
        for (int j = 0; j < Arr2.length; j++) {
            sumB += Arr2[j];
        }
        if (sumB > sumA) {
            Arr1 = Arr2;
        }
        return Arr1;
    }

    //第四题的方法：
    public static boolean equal_BeginningToEnding(int[] Arr3, int[] Arr4) {
        if (Arr3[0] == Arr4[0] || Arr3[Arr3.length - 1] == Arr4[Arr4.length - 1]) {
            return true;
        }
        return false;
    }

    //第五题的方法：
    public static boolean timesOfTwoAndThree(int[] Arr5) {
        int num2 = 0, num3 = 0;
        for (int i = 0; i < Arr5.length; i++) {
            if (Arr5[i] == 2) {
                num2++;
            }
            if (Arr5[i] == 3) {
                num3++;
            }
        }
        if (num2 >= 2 || num3 >= 2) return true;
        else return false;
    }

    //第六题的方法：
    public static boolean sixIsBeginningOrEnding(int[] Arr6) {
        if (Arr6[0] == 6 || Arr6[Arr6.length - 1] == 6) return true;
        else return false;
    }

    //第七题的方法：
    public static int[] threeBeZero(int[] Arr7) {
        for (int i = 0; i < Arr7.length - 1; i++) {
            if (Arr7[i] == 2 && Arr7[i + 1] == 3) {
                Arr7[i + 1] = 0;
            }
        }
        return Arr7;
    }

    //第九题的方法：
    public static int[] newArray(int[] Arr8) {
        int[] Arr9 = new int[2];
        if (Arr8.length <= 2) return Arr8;
        else {
            Arr9[0] = Arr8[0];
            Arr9[1] = Arr8[1];
        }
        return Arr9;
    }

    //第十题的方法：
    public static boolean inclusion2Or3(int[] Arr10) {
        for (int i = 0; i < Arr10.length; i++) {
            if (Arr10[i] == 2 || Arr10[i] == 3) {
                return true;
            }
        }
        return false;
    }

    //第十一题的方法：
    public static boolean exclusion2Or3(int[] Arr11) {
        for (int i = 0; i < Arr11.length; i++) {
            if (Arr11[i] == 2 || Arr11[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
