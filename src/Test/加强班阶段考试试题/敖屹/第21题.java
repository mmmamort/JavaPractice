package Test.加强班阶段考试试题.敖屹;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class 第21题 {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        String s;
        double sum = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Test\\加强班阶段考试试题\\敖屹\\book.txt"));
            while ((s = br.readLine()) != null) {
                String[] strings = s.split(",");
                books.add(new Book(strings[0], Double.parseDouble(strings[1]), Integer.parseInt(strings[2])));
                sum += Double.parseDouble(strings[1]) * Integer.parseInt(strings[2]);
            }
            for (Book book : books) {
                System.out.println(book);
            }
            System.out.println("图书总金额为：" + sum + "元");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
