package Homework.加强班;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 敖屹01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("第一题\nString中的equals只比较内容，Object中的equals比较内容和地址值。");

        System.out.println("\n第二题\nI love java\nme 2\n先执行第一句打印语句，并默认调用toString()方法，然后方法中“System.out.print(\"I \");”先执行完毕，再返回“java”，最终打印“I love java”并换行。然后a对象中的i自加，并最终打印“me 2”。");

        System.out.println("\n第三题");
        System.out.println("第一问：flase,S1为String类对象，值为地址值，S2的值为字符串常量；true，S1,S2的内容都为“abc”");
        System.out.println("第二问：true，都为“abc”字符串常量；false，内容相同。");
        System.out.println("第三问：true，都为“abc”字符串常量；false，内容相同。");
        System.out.println("第四问：flase,S3为String类对象，值为地址值，S2的值为字符串常量；true，S3,S2的内容都为“abc”");

        System.out.println("\n第四题");
        System.out.println("String的赋值为字符串常量且不可修改，每次更改内容即创建一个新的对象，适用操作次数少的情况；StringBuilder可反复更改而不会创建新对象，适用操作次数多的情况。");

        System.out.println("\n第五题");
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));

        System.out.println("\n第六题");
        String date1 = "2018-03-04";
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(format2.format(format1.parse(date1)));

        System.out.println("\n第七题");
        String[] list = {"天", "一", "二", "三", "四", "五", "六"};
        String dayOfWeek;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 2, 14);
        dayOfWeek = list[calendar.get(Calendar.DAY_OF_WEEK) - 1];//星期几 中文化。
        System.out.println(calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日是星期" + dayOfWeek);

        System.out.println("\n第八题");
        char[] charList = {'i', 't', 'c', 'a', 's', 'a'};
        for (int i = 0; i < charList.length; i++) {
            System.arraycopy(charList, 1, charList, charList.length - 1, 1);
        }
        System.out.println(new String().valueOf(charList));

        System.out.println("\n第九题");
        String s1 = "a";
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s1 += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String类用+=拼接100000次所花时间为" + (endTime - startTime) + "ms");
        StringBuilder s2 = new StringBuilder("a");
        startTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            s2.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder类用append拼接100000次所花时间为" + (endTime - startTime) + "ms");

        System.out.println("\n第十题");
        String[] numList = {"010", "3223", "666", "7890987", "123123"};
        int count = 0;
        for (int i = 0; i < numList.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (sb.append(numList[i]).toString().equals(sb.reverse().toString())) {
                System.out.println(numList[i] + "是对称的");
                count++;
                continue;
            }
            System.out.println(numList[i] + "不是对称的");
        }
        System.out.println("对称字符串个数为" + count);

        System.out.println("\n第十一题");
        StringBuilder sbNum = new StringBuilder();
        int[] arr = {7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    for (int k = 0; k < arr.length; k++) {
                        if (k != j && k != i) {
                            //三位数的百位
                            sbNum.append(arr[i]);
                            //三位数的十位
                            sbNum.append(arr[j]);
                            //三位数的个位
                            sbNum.append(arr[k] + " ");
                        }
                    }
                }
            }
        }
        System.out.println(sbNum.toString());
    }
}
