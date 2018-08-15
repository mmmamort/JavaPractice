package Test.基础班考试试题.敖屹.第四题;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Java基础入门", "传智播客", "清华大学出版社");
        Book book2 = new Book("Java学习笔记", "林信良", "人民邮电出版社");
        Book book3 = new Book("C语言入门经典", "霍顿", "清华大学出版社");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPublisher().equals("清华大学出版社"))
                System.out.println(list.get(i).getName() + "-" + list.get(i).getName() + "-" + list.get(i).getPublisher());
        }
    }
}
