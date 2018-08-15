package Homework.加强班.敖屹07;

import Homework.加强班.敖屹07.第九题.Director;
import Homework.加强班.敖屹07.第十一题.Student;
import Homework.加强班.敖屹07.第十题.Calculator;

import java.util.Arrays;

public class 敖屹07 {
    public static void main(String[] args) {
        System.out.println("第一题");
        {
            System.out.println("一个线程的集合，新建的线程可以被反复添加进集合，并被使用。");
        }

        System.out.println("\n第二题");
        {
            System.out.println("减少了反复创建功能相同的线程时，对系统资源的消耗。\n减少响应时间。\n对同时可进行的线程数进行管控，防止宕机。");
        }
        System.out.println("\n第三题");
        {
            System.out.println("参数类型可以省略；执行语句只有一时，可以省略大括号及语句后的分号；有且只有一个参数时，小括号可以省略。");
        }

        System.out.println("\n第四题");
        {
            System.out.println("() -> {}");
            System.out.println("(参数类型 参数) 小箭头 {执行代码}");
        }

        System.out.println("\n第五题");
        {
            System.out.println("先要有内含唯一抽象方法的接口，所使用的参数类型要能匹配");
        }

        System.out.println("\n第六题:在包“第六题”内");

        System.out.println("\n第七题");
        {
            System.out.println("不会运行，编译报错，没有重写run()方法。");
        }

        System.out.println("\n第八题：在包“第八题”内");


        System.out.println("\n第九题");
        {
            invokeDirect(() -> {
                System.out.println("复仇者联盟四");
            });
        }

        System.out.println("\n第十题");
        {
            invokeCalc(12, 18, (a, b) -> a + b);
        }

        System.out.println("\n第十一题");
        {
            Student stu1 = new Student("张三", 89);
            Student stu2 = new Student("李四", 97);
            Student stu3 = new Student("王五", 83);
            Student stu4 = new Student("赵六", 100);
            Student[] students = {stu1, stu2, stu3, stu4};
            Arrays.sort(students, (Student stuA, Student stuB) -> stuB.getScore() - stuA.getScore());
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    //第九题方法
    private static void invokeDirect(Director director) {
        director.makeMovie();
    }

    //第十题方法
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
