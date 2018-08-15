package Homework.加强班.敖屹08;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class 敖屹08 {
    public static void main(String[] args) {
        System.out.println("基础题一");
        File file1 = new File("g:\\Java\\src\\其他");
        File file2 = new File("其他");

        System.out.println("\n基础题二");
        File a_txt = new File(file1, "a.txt");
        try {
            System.out.println(file1.getAbsolutePath() + "是否可以新建一个a.txt文件" + a_txt.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n基础题三");
        File file4 = new File(file1, "bbb\\");
        System.out.println(file1.getAbsolutePath() + "是否可以新建一个bbb文件夹" + file4.mkdir());

        System.out.println("\n基础题四");
        File file5 = new File(file1, "ccc\\ccc子文件夹");
        System.out.println(file1.getAbsolutePath() + "是否可以新建一个ccc\\ccc子文件夹" + file5.mkdirs());

        System.out.println("\n基础题五");
        System.out.println("删除a.txt " + a_txt.delete());
        System.out.println("删除bbb文件夹 " + file4.delete());
        System.out.println("删除ccc\\ccc子文件夹" + file5.delete());

        System.out.println("\n基础题六");
        File b_txt = new File(file1, "ccc\\b.txt");
        try {
            b_txt.createNewFile();
            System.out.println("文件名：" + b_txt.getName() + "\n文件大小：" + b_txt.length() + "\n绝对路径：" + b_txt.getAbsolutePath() + "\n父路径：" + b_txt.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n基础题七");
        checkFile(b_txt);
        checkFile(file1);
        checkDirectory(b_txt);
        checkDirectory(file1);

        System.out.println("\n基础题八");
        for (File file : file1.listFiles()) {
            System.out.println(file);
        }

        System.out.println("\n\n扩展题一");
        System.out.println("请输入需要判断的文件路径");
        File scanFile = new File(new Scanner(System.in).nextLine());
        if (scanFile.isFile()) System.out.println(scanFile.getName() + "是文件，文件大小为：" + scanFile.length());
        else if (scanFile.isDirectory())
            System.out.println(scanFile.getName() + "是文件夹，不包含子文件夹大小为：" + sumFileLength(scanFile));

        System.out.println("\n扩展题二");
        {
            int month = 24;
            System.out.println(month + "月后有" + sumRabbit(month) + "对兔子");
        }

        System.out.println("\n扩展题三");
        {
            int day = 10;
            System.out.println("如果第" + day + "天还剩一个桃子，则猴子第一天摘了" + sumPeach(day) + "个桃子");
        }

        System.out.println("\n扩展题四");
        {
            searchFile(new File("G:\\Java"));
        }

        System.out.println("\n扩展题五");
        {
            deleteFile(new File("G:\\Java\\src\\其他\\ccc"));
        }

        System.out.println("\n扩展题六");
        {
            File files = new File("G:\\other");
            System.out.println(files.getAbsolutePath() + "文件夹大小为：" + sumFilesLength(files));
        }
    }

    //基础题七方法checkDirecotory
    public static void checkDirectory(File file) {
        if (file.isDirectory()) System.out.println("\"" + file.getName() + "\"" + "是一个文件夹");
        else System.out.println("\"" + file.getName() + "\"" + "不是一个文件夹");
    }

    //基础题七方法checkFile
    public static void checkFile(File file) {
        if (file.isFile()) System.out.println("\"" + file.getName() + "\"" + "是一个文件");
        else System.out.println("\"" + file.getName() + "\"" + "不是一个文件");
    }

    //扩展题一的方法sumFileLength
    static double sumFileLength = 0;

    public static double sumFileLength(File file) {
        for (File f : file.listFiles()) {
            sumFileLength += f.length();
        }
        return sumFileLength;
    }

    //扩展题二的方法sumRabbit
    public static int sumRabbit(int month) {
        if (month < 3) return 1;
        return sumRabbit(month - 1) + sumRabbit(month - 2);
    }

    //扩展题三的方法sumPeach
    public static int sumPeach(int day) {
        if (day != 1) return 2 * (sumPeach(--day) + 1);
        return 1;
    }

    //扩展题四的方法
    public static void searchFile(File newFile) {
        for (File f : newFile.listFiles()) {
            if (!f.isFile()) searchFile(f);
            else if (f.getName().endsWith(".java")) System.out.println(f);
        }
    }

    //扩展题五的方法
    public static void deleteFile(File newFile) {
        for (File f : newFile.listFiles()) {
            if (f.isFile()) f.delete();
            else {
                deleteFile(f);
                f.delete();
            }
        }
        newFile.delete();
    }

    //扩展题六的方法sumFilesLength
    static double sumFilesLength = 0;

    public static double sumFilesLength(File file) {
        for (File f : file.listFiles()) {
            if (f.isFile()) sumFileLength += f.length();
            else sumFilesLength(f);
        }
        return sumFileLength;
    }
}
