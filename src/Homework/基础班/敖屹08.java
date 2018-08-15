package Homework.基础班;

import java.util.Arrays;

public class 敖屹08 {
    public static void main(String[] args) {
        System.out.println("第一题如下：");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(toString(arr));

        System.out.println("\n第二题如下：");
        String numStr = "25 11 -6 20 102 9";
        String[] str = numStr.split(" ");
        int[] strNum = new int[str.length];
        for (int p = 0; p < str.length; p++) {
            strNum[p] = Integer.parseInt(str[p]);
        }
        Arrays.sort(strNum);
        String s0="";
        for (int q = 0; q < strNum.length; q++) {
            if (q != strNum.length - 1) {
                s0 += strNum[q] + " ";
            } else {
                s0 += strNum[q] + "";
            }
        }
        System.out.println(s0);

        System.out.println("\n第三题如下：");
        String s1 = "abc", s2 = "def";
        System.out.println(s1 + " 与 " + s2 + " 的最后结果为： " + subString(s1, s2));

        System.out.println("\n第四题如下：");
        String s3 = "xasgpijaspgx";
        System.out.println(s3 + " 的最后结果为： " + withoutX(s3));

        System.out.println("\n第五题如下：");
        String s4 = "abc", s5 = "cat";
        System.out.println(s4 + " 与 " + s5 + " 的最后结果为： " + juxtaposition(s4, s5));

        System.out.println("\n第六题如下：");
        String s6 = "abasdaosj", s7 = "fingidj";
        System.out.println(s6 + " 与 " + s7 + " 最后的结果为： " + subStr(s6) + " 与 " + subStr(s7));

        System.out.println("\n第七题如下：");
        String s8 = "qedf", s9 = "";
        System.out.println(s8 + " 与 " + s9 + " 最后的结果为： " + lastChars(s8, s9));
    }

    //      第一题的方法；
    public static String toString(int[] arr) {
        if (arr == null) {
            return "null";
        } else if (arr.length == 0) {
            return "[]";
        } else {
            String s = "[";
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    s = s.concat(arr[i] + "]");
                } else {
                    s = s.concat(arr[i] + ",");
                }
            }
            return s;
        }
    }

    //      第三题的方法；
    public static String subString(String s1, String s2) {
        if (s1.length() >= 1 && s2.length() >= 1) {//字符串至少为1；
            return s1.substring(1) + s2.substring(1);
        } else {
            return "不符合要求";
        }
    }

    //      第四题的方法；
    public static String withoutX(String s) {
        if (s.indexOf('x') == 0 && s.lastIndexOf('x') == s.length() - 1) {
            return s.substring(1, s.length() - 1);
        } else if (s.indexOf('x') == 0) {
            return s.substring(1);
        } else if (s.indexOf('x') == s.length() - 1) {
            return s.substring(0, s.length() - 1);
        } else return s;
    }

    //      第五题的方法；
    public static String juxtaposition(String s1, String s2) {
        char ch = s1.charAt(s1.length() - 1);
        if (ch == s2.charAt(0)) {
            return s1 + s2.substring(1);
        } else return s1 + s2;
    }

    //      第六题的方法；
    public static String subStr(String s) {
        if (s.length() >= 2) {
            if (s.indexOf('a') == 0 && s.indexOf('b') == 1) {
                return s;
            } else if (s.indexOf('a') == 0) {
                return s.substring(1);
            } else if (s.indexOf('b') == 1) {
                return "a" + s.substring(2, s.length());
            } else return s.substring(2);
        } else return "错误，字符长度小于2。";
    }

    //      第七题的方法；
    public static String lastChars(String s1, String s2) {
        if (s1.length() > 0 && s2.length() > 0) {
            return s1.charAt(0) + "" + s2.charAt(s2.length() - 1);
        } else if (s1.length() > 0) {
            return s1.charAt(0) + "@";
        } else if (s2.length() > 0) {
            return "@" + s2.charAt(s2.length() - 1);
        } else return "@@";
    }
}
