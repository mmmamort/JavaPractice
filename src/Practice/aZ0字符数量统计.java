package Practice;

import java.util.Scanner;

public class aZ0字符数量统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count1 = new int[26];                     //小写字母统计数组；
        int[] count2 = new int[26];                     //大写字母统计数组；
        int[] count3 = new int[10];                     //数字字符统计数组；
        int num = 0;                                     //代表字符在数组中的索引；
        char ch = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch <= 'z' && ch >= 'a') {               //小写字母统计个数；
                for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
                    if (ch == ch1) {
                        num = (int) (ch1 - 97);
                        count1[num]++;
                    }
                }
            } else if (ch <= 'Z' && ch >= 'A') {        //大写字母统计个数；
                for (char ch2 = 'A'; ch2 <= 'Z'; ch2++) {
                    if (ch == ch2) {
                        num = (int) (ch2 - 65);
                        count2[num]++;
                    }
                }
            } else if (ch <= '9' && ch >= '0') {        //数字字符统计个数；
                for (char ch3 = '0'; ch3 <= '9'; ch3++) {
                    if (ch == ch3) {
                        num = (int) (ch3 - 48);
                        count3[num]++;
                    }
                }
            }
        }
        for (int i = 0; i < count1.length; i++) {                           //循环遍历输出小写字母个数
            if (count1[i] == 0) {
            } else {
                ch = (char) (i + 97);
                System.out.print(ch + "有" + count1[i] + "个 ");
            }
        }
        System.out.println();
        for (int j = 0; j < count2.length; j++) {                           //循环遍历输出大写字母个数
            if (count2[j] == 0) {
            } else {
                ch = (char) (j + 65);
                System.out.print(ch + "有" + count2[j] + "个 ");
            }
        }
        System.out.println();
        for (int k = 0; k < count3.length; k++) {                           //循环遍历输出数字字符个数
            if (count3[k] == 0) {
            } else {
                ch = (char) (k + 48);
                System.out.print(ch + "有" + count3[k] + "个 ");
            }
        }
    }
}





