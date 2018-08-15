package Homework.加强班.敖屹02;

import java.util.*;

public class 敖屹02 {
    public static void main(String[] args) {
        System.out.println("第一题\n集合分为单列集合Collection，双列集合Map；单列集合Collection分有序可重复的List结构（包括ArrayList，LinkedList，Vector）及无序不可重复的Set结构（HashSet,LinkedSet,TreeSet）");

        System.out.println("\n第二题");
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:" + listTest(list, "a"));
        System.out.println("b:" + listTest(list, "b"));
        System.out.println("c:" + listTest(list, "c"));
        System.out.println("xxx:" + listTest(list, "xxx"));

        System.out.println("\n第三题");
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(arrToList(arr1));

        System.out.println("\n第四题");
        Collection<Integer> col = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            col.add(i);
        }
        listToArr(col);

        System.out.println("\n第五题");
        String[] sList = {"asf", "s", "aigg", "aos"};
        Collection<String> colList1 = new ArrayList<>(Arrays.asList(sList));
        ArrayList<String> list2 = (ArrayList<String>) colList1;
        listTest(list2, "s");

        System.out.println("\n第六题");
        Collection<String> colList2 = new ArrayList<>();
        ArrayList<String> sList1 = (ArrayList<String>) colList2;
        listTest(sList1);

        System.out.println("\n第七题\n通过Iterator()方法创建迭代对象，使用hasNext()方法来判断有没有下一个元素，若有则可以用next()方法来获取下一个元素，并移动指针，用来做下次hasNext()的准备。");

        System.out.println("\n第八题");
        Integer[] sList2 = {1, 2, 3, 4, 5, 6, 7};
        Collection<Integer> colList3 = new ArrayList<>(Arrays.asList(sList2));
        ArrayList<Integer> list3 = (ArrayList<Integer>) colList3;
        listTest(list3, 6);

        System.out.println("\n第九题");
        Student stu1 = new Student("张三", 18, "男");
        Student stu2 = new Student("李四", 19, "男");
        Student stu3 = new Student("王五", 20, "男");
        Collection<Student> list4 = new ArrayList();
        list4.add(stu1);
        list4.add(stu2);
        list4.add(stu3);
        for (Object o : list4) {
            System.out.println(o);
        }
        Iterator<Student> stu = list4.iterator();
        Student stuOlder = stu.next();
        Student stuTemp;
        while (stu.hasNext()) {
            stuTemp = stu.next();
            stuOlder = stuOlder.getAge() > stuTemp.getAge() ? stuOlder : stuTemp;
        }
        stuOlder.setName("小猪佩奇");
        System.out.println("年龄最大的：" + stuOlder);

        System.out.println("\n第十题");
        Collection<Integer> col1 = new ArrayList<>();
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100) + 1;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 10) col1.add(arr[j]);
        }
        System.out.println(col1);

        System.out.println("\n第十一题");
        String arr2[] = {"abc", "ab", "a"};
        Integer arr3[] = {111, 222, 333, 444};
        System.out.println("交换前：" + Arrays.toString(arr2));
        swap(arr2, 0, 2);
        System.out.println("交换后：" + Arrays.toString(arr2));
        System.out.println("交换前：" + Arrays.toString(arr3));
        swap(arr3, 1, 3);
        System.out.println("交换后：" + Arrays.toString(arr3));

        System.out.println("\n第十二题");
        String arr4[] = {"a", "b", "c", "d"};
        Integer arr5[] = {1, 2, 3, 4};
        System.out.println("交换前：" + Arrays.toString(arr4));
        sort(arr4);
        System.out.println("交换后：" + Arrays.toString(arr4));
        System.out.println("交换前：" + Arrays.toString(arr5));
        sort(arr5);
        System.out.println("交换后：" + Arrays.toString(arr5));
    }

    //第二题的方法
    public static int listTest(Collection<String> list, String s) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (String temp : list) {
            if (temp.equals("a")) count1++;
            else if (temp.equals("b")) count2++;
            else if (temp.equals("c")) count3++;
            else count4++;
        }
        if (s.equals("a")) return count1;
        else if (s.equals("b")) return count2;
        else if (s.equals("c")) return count3;
        else return count4;
    }

    //第三题的方法
    public static Collection<Integer> arrToList(int[] arr) {
        Collection<Integer> col = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            col.add(arr[i]);
        }
        return col;
    }

    //第四题的方法
    public static void listToArr(Collection<Integer> col) {
        Object[] obj = new Object[col.size()];
        int count = 0;
        for (Integer integer : col) {
            obj[count] = integer;
            count++;
        }
        System.out.println(Arrays.toString(obj));
    }

    //第五题的方法
    public static void listTest(ArrayList<String> al, String s) {
        System.out.println(al + "集合中是否含有" + s + ": " + al.contains(s));
    }

    //第六题的方法
    public static void listTest(ArrayList<String> al) {
        if (al.isEmpty()) System.out.println(al + "集合为空");
        else System.out.println(al + "集合不为空");
    }

    //第八题的方法
    public static void listTest(ArrayList<Integer> al, Integer s) {
        System.out.println(al + "第一次出现" + s + "的索引为" + al.indexOf(s));
    }

    //第十一题的方法
    public static <ET> void swap(ET[] arr, int index1, int index2) {
        ET temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //第十二题的方法
    public static <E> void sort(E[] arr) {
        int num = arr.length / 2;
        for (int i = 0; i < num; i++) {
            E temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}