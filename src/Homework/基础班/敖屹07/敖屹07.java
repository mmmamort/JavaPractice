package Homework.基础班.敖屹07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 敖屹07 {
    public static void main(String[] args) {
        System.out.println("第一题如下：");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(100) + 1);
        }
        for (int j = 0; j < list1.size(); j++) {
            System.out.println(list1.get(j));
        }

        System.out.println("\n第二题如下：");
        ArrayList<String> list2 = new ArrayList<>();
        String s1 = "qohasd", s2 = "def", s3 = "oqsnfjo";
        list2.add(s1);
        list2.add(s2);
        list2.add(s3);
        list2.remove("def");
        for (int j = 0; j < list2.size(); j++) {
            System.out.println(list2.get(j));
        }

        System.out.println("\n第三题如下：");
        Worker employee1 = new Worker("凤姐", 18, 20000);
        Worker employee2 = new Worker("欧阳锋", 60, 8000);
        Worker employee3 = new Worker("刘德华", 40, 30000);
        ArrayList<Worker> list3 = new ArrayList<>();
        list3.add(employee1);
        list3.add(employee2);
        list3.add(employee3);
        for (int k = 0; k < list3.size(); k++) {//打印相应员工正在工作。
            list3.get(k).work();
        }
        for (int l = 0; l < list3.size(); l++) {
            if (list3.get(l).getName() == "刘德华") {//删除list3中员工“刘德华”的信息。
                list3.remove(l);
                l--;
            } else//循环遍历，打印list3中的员工信息。
                System.out.println(list3.get(l));
        }

        System.out.println("\n第四题如下：");
        int time = 2;//允许错误次数。
        Scanner sc = new Scanner(System.in);
        String user, password;
        while (time >= 0) {
            System.out.println("请输入用户名：");
            user = sc.nextLine();
            System.out.println("请输入密码：");
            password = sc.nextLine();
            if (user.equals("admin") && password.equals("admin")) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("用户名或者密码错误，您还有" + time + "次机会");
                time--;
            }
        }
    }
}
