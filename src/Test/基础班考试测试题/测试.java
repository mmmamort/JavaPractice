package Test.基础班考试测试题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 测试 {
    public static void main(String[] args) {
        System.out.println("第一题");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额");
        int money = sc.nextInt();
        if (money >= 2000) {
            System.out.println("打7折");
        } else if (money >= 1000) {
            System.out.println("打8折");
        } else if (money >= 500) {
            System.out.println("打9.5折");
        } else if (money >= 0) {
            System.out.println("不打折");
        }

        System.out.println("\n第二题");
        int[] arr = {1, 2, 3, 4, 5, 6, 7,};
        comp(arr);

        System.out.println("\n第三题");
        Scanner sc2 = new Scanner(System.in);
        ArrayList<String> ArrayList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        System.out.println("请输入五个字符串");
        for (int i = 0; i < 5; i++) {
            ArrayList.add(sc2.nextLine());
        }
        for (int j = 0; j < ArrayList.size(); j++) {
            if (ArrayList.get(j).length() < 5) newList.add(ArrayList.get(j));
        }
        for (int k = 0; k < newList.size(); k++) {
            System.out.println(newList.get(k));
        }

        System.out.println("\n第四题");
        Phone myPhone = new Phone("iphone", 15);
        myPhone.checkPower();

        System.out.println("\n第五题");
        IPhone phone = new IPhone("我的");
        Song s = new Song("周杰伦", "发如雪");
        phone.btFunction();
        phone.connecting();
        phone.playMusic(s);
    }

    public static void comp(int[] arr) {
        Arrays.sort(arr);
        System.out.println("最小值" + arr[0] + "\n最大值" + arr[arr.length - 1]);
    }
}

