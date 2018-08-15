package Homework.基础班.敖屹07;

import java.util.ArrayList;

public class 第七天第二题改 {
    // 创建集合对象
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s, s1 = "qohasddef", s2 = "def", s3 = "oqsnfjo";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.remove("def");
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replace("def", ""));
        }
        System.out.println(list);
    }
}





