package Homework.基础班.敖屹09;

import Homework.基础班.敖屹09.第一题需求三.Cat;
import Homework.基础班.敖屹09.第一题需求三.Dog;
import Homework.基础班.敖屹09.第一题需求二.Student;
import Homework.基础班.敖屹09.第一题需求二.Teacher;
import Homework.基础班.敖屹09.第一题需求一.Manager;
import Homework.基础班.敖屹09.第一题需求一.Programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class 敖屹09 {
    public static void main(String[] args) {
        System.out.println("第一题如下：");
        System.out.println("需求一：");
        Programmer programmer = new Programmer("马化腾", 01, 100);
        programmer.work();
        Manager manager = new Manager("丁磊", 02, 200, 100000);
        System.out.println();
        manager.work();

        System.out.println("\n需求二：");
        Student student = new Student("黄晓明", 18);
        student.study();
        Teacher teacher = new Teacher("黄磊", 30);
        System.out.println();
        teacher.prelection();

        System.out.println("\n需求三：");
        Dog dog = new Dog("灰色", 4);
        dog.information();
        dog.eatFood();
        dog.lookHome();
        Cat cat = new Cat("白色", 4);
        System.out.println();
        cat.information();
        cat.eatFood();
        cat.catchMouse();

        System.out.println("\n第二题如下：");
        Phone phone0 = new Phone("苹果", "ios", "苹果公司");
        Phone phone1 = new Phone("小米", "android", "小米公司");
        Phone phone2 = new Phone("华为", "android", "华为公司");
        ArrayList<Phone> list = new ArrayList<>();
        list.add(phone0);
        list.add(phone1);
        list.add(phone2);
        String s = new String();
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i).getSystem();
            if (s.equals("android")) {
                System.out.println(list.get(i).toString());
            }
        }

        System.out.println("\n第三题如下：");
        int[] arr = new int[5];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(61) + 20;
        }
        System.out.println("未修改前" + "\t" + Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 60) {
                arr[j] = 9;
            }
        }
        System.out.println("修改后" + "    \t" + Arrays.toString(arr));

        System.out.println("\n第四题如下：");
        int[] arr1 = {1, 2, 3, 4, 56, 7, 2, 2};
        System.out.println(Arrays.toString(arr1) + "最后结果为：" + Has22_More14.has22(arr1));

        System.out.println("\n第五题如下：");
        int[] arr2 = {1, 1, 1, 1, 56, 7, 1, 2};
        System.out.println(Arrays.toString(arr2) + "最后结果为：" + Has22_More14.more14(arr2));
    }
}
