package Homework.加强班.敖屹06.第九题;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class 第九题 {
    public static void main(String[] args) {
        Number num = new Number();
        String[] name = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈"};
        Set<Integer> list = new HashSet<>();
        while (list.size() < 10) {
            list.add(new Random().nextInt(10));
        }
        for (Integer i : list) {
            Thread person = new Thread(num, name[i]);
            person.start();
        }
    }
}
