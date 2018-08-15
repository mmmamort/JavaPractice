package Homework.加强班.敖屹03;


import java.util.*;

public class 敖屹03 {
    public static void main(String[] args) {
        System.out.println("第一题\n实现了List接口的对象为List集合，List集合存取有序，允许元素重复。");

        System.out.println("\n第二题\n根据hashCode找到相应的位置，如果为空直接存入，否则调用equals方法判断内容是否相同，相同则不存入；同一位置下如果超过8个元素则转换成红黑树结构。");

        System.out.println("\n第三题\n堆栈：从栈顶先进后出，不允许增删。\n队列：分别从队列两端进出，查找快，增删慢。\n链表：由一个元素的指针指向下一个元素的地址，查找慢，增删快\n红黑树：左子树小，右子树大");

        System.out.println("\n第四题\nComparable在类中写死，无法在测试类中修改;Comparator可以反复修改排列的顺序。");

        System.out.println("\n第五题");
        LinkedList<Integer> list0 = new LinkedList<>();
        list0.add(111);
        list0.add(444);
        list0.add(333);
        list0.set(2, 222);
        System.out.println(list0.get(2));
        list0.remove(2);
        list0.clear();
        list0.size();
        list0.add(111);
        list0.addFirst(000);
        list0.addLast(222);
        System.out.println(list0.getFirst());
        System.out.println(list0.getLast());
        list0.removeFirst();
        list0.removeLast();
        list0.push(123);
        list0.pop();

        System.out.println("第六题");
        Person p3 = new Person("太鼓达人", 13);
        Person p1 = new Person("啦啦啦", 999);
        Person p2 = new Person("啪嗒砰", 3);
        Person p4 = new Person("啦啦啦", 999);
        HashSet<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println(people);

        System.out.println("\n第七题");
        String[] sList = {"张三", "李四", "王五", "二丫", "钱六", "孙七"};
        List<String> list = new ArrayList<>(Arrays.asList(sList));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("二丫")) list.set(i, "王小丫");
        }
        System.out.println(list);

        System.out.println("\n第八题");
        String[] sList1 = {"王昭君", "王昭君", "西施", "杨玉环", "貂蝉"};
        LinkedHashSet<String> people1 = new LinkedHashSet<>(Arrays.asList(sList1));
        Iterator it = people1.iterator();
        System.out.print("迭代器遍历：");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.print("\n加强For循环遍历：");
        for (String s : people1) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("\n第九题");
        Integer[] iList = {33, 11, 77, 55};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(iList));
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("\n第十题");
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> qqNum = new LinkedList<>(Arrays.asList(strs));
        for (int i = 0; i < qqNum.size() - 1; i++) {
            for (int j = i + 1; j < qqNum.size(); j++) {
                if (qqNum.get(i).equals(qqNum.get(j))) {
                    qqNum.remove(j);
                }
            }
        }
        Iterator it1 = qqNum.iterator();
        System.out.print("迭代器遍历：");
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
        System.out.print("\n加强For循环遍历：");
        for (String s : qqNum) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("\n第十一题");
        System.out.println("请输入字符串：");
        String str = new Scanner(System.in).nextLine();
        LinkedHashSet<Character> strs1 = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++) {
            strs1.add(str.charAt(i));
        }
        Iterator it2 = strs1.iterator();
        System.out.print("迭代器遍历：");
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.print("\n加强For循环遍历：");
        for (Character character : strs1) {
            System.out.print(character + " ");
        }


        System.out.println("\n第十二题");
        HashSet<Integer> ball = new HashSet<>();
        while (ball.size() < 6) {
            ball.add(new Random().nextInt(33) + 1);
        }
        ArrayList ballList = new ArrayList();
        for (Integer number : ball) {
            ballList.add("红球" + number);
        }
        ballList.add("蓝球" + (new Random().nextInt(16) + 1));
        System.out.println("双色球投注号码：" + ballList);

        System.out.println("\n第十三题");
        System.out.println("Comparable排序");
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("liusan", 20, 90.0F));
        list2.add(new Student("lisi", 22, 90.0F));
        list2.add(new Student("wangwu", 20, 99.0F));
        list2.add(new Student("sunliu", 22, 100.0F));
        Collections.sort(list2);
        for (Student student : list2) {
            System.out.println(student);
        }
        System.out.println("Comparator排序");
        ArrayList<Student> list3 = new ArrayList<>();
        list3.add(new Student("liusan", 20, 90.0F));
        list3.add(new Student("lisi", 22, 90.0F));
        list3.add(new Student("wangwu", 20, 99.0F));
        list3.add(new Student("sunliu", 22, 100.0F));
        Collections.sort(list3, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                float result = o2.getScore() - o1.getScore();
                if (result == 0) {
                    result = o1.getAge() - o2.getAge();
                }
                if (result > 0) return 1;
                else return result < 0 ? -1 : 0;
            }
        });
        for (Student student : list3) {
            System.out.println(student);
        }
    }
}
