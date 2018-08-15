package Homework.加强班.敖屹09;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class 敖屹09 {
    public static void main(String[] args) throws IOException {
      /*  System.out.println("第一题");
        FileOutputStream a_txt = new FileOutputStream("g:\\字节流\\a.txt");
        a_txt.write('a');
        a_txt.write('b');
        a_txt.write('c');
        a_txt.write('d');
        a_txt.close();

        System.out.println("\n第二题");
        FileOutputStream b_txt = new FileOutputStream("g:\\字节流\\b.txt");
        b_txt.write("i love java".getBytes());
        b_txt.close();

        System.out.println("\n第三题");
        {
            FileOutputStream c_txt = new FileOutputStream("g:\\字节流\\c.txt");
            c_txt.write("HelloWorld".getBytes());
            FileOutputStream c_txt_append = new FileOutputStream("g:\\字节流\\c.txt", true);
            for (int i = 0; i < 5; i++) {
                c_txt_append.write("\ni love java".getBytes());
            }
            c_txt.close();
            c_txt_append.close();
        }

        System.out.println("\n第四题");
        {
            FileInputStream a_read = new FileInputStream("g:\\字节流\\a.txt");
            int len;
            while ((len = a_read.read()) != -1) {
                System.out.println((char) len);
            }
            a_read.close();
        }

        System.out.println("\n第五题");
        {
            FileInputStream b_read_arr = new FileInputStream("g:\\字节流\\b.txt");
            int len;
            byte[] bytes = new byte[2];
            while ((len = b_read_arr.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            b_read_arr.close();
        }

        System.out.println("\n第六题");
        {
            FileInputStream a_png = new FileInputStream("g:\\字节流\\a.png");
            FileOutputStream a_copy = new FileOutputStream("g:\\字节流\\a_copy.png");
            int len;
            byte[] bytes = new byte[1024];
            while ((len = a_png.read(bytes)) != -1) {
                a_copy.write(bytes, 0, len);
            }
            a_png.close();
            a_copy.close();
        }

        System.out.println("\n第七题");
        {
            FileWriter info_txt = new FileWriter("g:\\字符流\\Info.txt");
            String s = new String();
            ArrayList<String> temp_list = new ArrayList<>();
            while (true) {
                System.out.println("请输入存储的信息，输入“886”结束");
                s = new Scanner(System.in).nextLine();
                if (s.equals("886")) break;
                temp_list.add(s);
            }
            for (String s1 : temp_list) {
                info_txt.write(s1 + "\r\n");
            }
            System.out.println(temp_list);
            info_txt.close();
        }

        System.out.println("\n第八题");
        {
            Properties score_txt = new Properties();
            score_txt.load(new FileInputStream("G:\\字符流\\score.txt"));
            Set<String> nameList = score_txt.stringPropertyNames();
            for (String nameTemp : nameList) {
                if (nameTemp.equals("lisi")) score_txt.setProperty(nameTemp, "100");
            }
            score_txt.store(new FileOutputStream("G:\\字符流\\score.txt"), null);
        }

        System.out.println("\n扩展第一题");
        {
            FileInputStream test_txt = new FileInputStream("G:\\字节流\\Test.txt");
            countA(test_txt);
            test_txt.close();
        }

        System.out.println("\n扩展第二题");
        {
            FileOutputStream stu_txt = new FileOutputStream("G:\\字节流\\stu.txt");
            String s = new String();
            while (true) {
                System.out.println("请输入存储的学生信息（学号-学生名字)，输入“end”结束");
                s = new Scanner(System.in).nextLine();
                if (s.equals("end")) break;
                stu_txt.write((s + "\r\n").getBytes());
            }
            stu_txt.close();
        }

        System.out.println("\n扩展第三题");
        {
            FileWriter student_txt = new FileWriter("G:\\字符流\\Student.txt");
            Student stu1 = new Student("张三", 28);
            Student stu2 = new Student("李四", 15);
            Student stu3 = new Student("王五", 33);
            ArrayList<Student> stuList = new ArrayList<>();
            stuList.add(stu1);
            stuList.add(stu2);
            stuList.add(stu3);
            for (Student student : stuList) {
                student_txt.write(student.toString() + "\r\n");
            }
            student_txt.close();
        }
    }

    //扩展第一题countA方法
    private static void countA(FileInputStream test_txt) throws IOException {
        int len;
        int count = 0;
        while ((len = test_txt.read()) != -1) {
            if ('a' == (char) len) count++;
        }
        System.out.println("a出现" + count + "次");*/
        FileWriter asdasdasd = new FileWriter("asdasdasd.txt");
    }
}
