package Homework.加强班.敖屹10;

import Homework.加强班.敖屹05.第九题.ScoreOutOfBoundsException;
import Practice.WithoutDoubles;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 敖屹10 {
    public static void main(String[] args) {
        System.out.println("第一题");
        try {
            BufferedOutputStream d_txt = new BufferedOutputStream(new FileOutputStream("src\\Homework\\加强班\\敖屹10\\file\\d.txt"));
            d_txt.write(98);
            d_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n第二题");
        try {
            BufferedOutputStream e_txt = new BufferedOutputStream(new FileOutputStream("src\\Homework\\加强班\\敖屹10\\file\\e.txt"));
            e_txt.write("i love java".getBytes());
            e_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n第三题");
        try {
            BufferedInputStream c_png = new BufferedInputStream(new FileInputStream("src\\Homework\\加强班\\敖屹10\\file\\c.png"));
            BufferedOutputStream c_copy = new BufferedOutputStream(new FileOutputStream("src\\Homework\\加强班\\敖屹10\\copy_file\\c_copy.png"));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = c_png.read(bytes)) != -1) {
                c_copy.write(bytes, 0, len);
            }
            c_copy.close();
            c_png.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n第四题");
        try {
            BufferedWriter data_txt = new BufferedWriter(new FileWriter("src\\Homework\\加强班\\敖屹10\\file\\data.txt"));
            BufferedReader data_read = new BufferedReader(new FileReader("src\\Homework\\加强班\\敖屹10\\file\\data.txt"));
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入需要存入的验证码");
                data_txt.write(new Scanner(System.in).next());
                data_txt.newLine();
            }
            data_txt.close();
            System.out.println("请输入需要校验的验证码");
            String s;
            String check = new Scanner(System.in).next();
            Boolean flag = false;
            while ((s = data_read.readLine()) != null) {
                if (s.equals(check)) flag = true;
            }
            if (flag) System.out.println("验证成功");
            else System.out.println("验证失败");
            data_read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n第五题");
        try {
            OutputStreamWriter a_txt = new OutputStreamWriter(new FileOutputStream("src\\Homework\\加强班\\敖屹10\\file\\a.txt"), "GBK");
            a_txt.write("我爱Java");
            a_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n第六题");
        try {
            InputStreamReader a_txt = new InputStreamReader(new FileInputStream("src\\Homework\\加强班\\敖屹10\\file\\a.txt"), "GBK");
            int len;
            while ((len = a_txt.read()) != -1) {
                System.out.print((char) len);
            }
            a_txt.close();
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n扩展题第一题");
        Student stu1 = new Student("李明", 22, "男");
        Student stu2 = new Student("韩梅梅", 21, "女");
        try {
            ObjectOutputStream stu_txt = new ObjectOutputStream(new FileOutputStream("src\\Homework\\加强班\\敖屹10\\file\\stu.txt"));
            stu_txt.writeInt(2);
            stu_txt.writeObject(stu1);
            stu_txt.writeObject(stu2);
            stu_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n扩展题第二题");
        try {
            Student stu;
            ObjectInputStream stu_txt = new ObjectInputStream(new FileInputStream("src\\Homework\\加强班\\敖屹10\\file\\stu.txt"));
            int i = stu_txt.readInt();
            for (int i1 = 0; i1 < i; i1++) {
                stu = (Student) stu_txt.readObject();
                System.out.println(stu);
            }
            stu_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n扩展题第三题");
        try {
            PrintStream d_txt = new PrintStream("src\\Homework\\加强班\\敖屹10\\file\\d.txt");
            System.out.println("请输入需要保存到d.txt中的内容");
            d_txt.println(new Scanner(System.in).next());
            d_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n扩展题第四题");
        try {
            BufferedReader text_read = new BufferedReader(new FileReader("src\\Homework\\加强班\\敖屹10\\file\\text.txt"));
            ArrayList<String> list = new ArrayList<>();
            String s;
            while ((s = text_read.readLine()) != null) {
                System.out.println(s);
                list.add(s);
            }
            text_read.close();
            BufferedWriter text_txt = new BufferedWriter(new FileWriter("src\\Homework\\加强班\\敖屹10\\file\\text.txt"));
            Collections.reverse(list);
            for (String s1 : list) {
                text_txt.write(s1);
                text_txt.newLine();
            }
            text_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n扩展题第五题");
        ArrayList<Student> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);
        try {
            ObjectOutputStream stus_txt = new ObjectOutputStream(new FileOutputStream("src\\Homework\\加强班\\敖屹10\\file\\stus.txt"));
            stus_txt.writeObject(stus);
            stus_txt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
