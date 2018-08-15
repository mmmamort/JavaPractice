package Practice;

import java.io.*;

public class 字节流HelloWorld {

    public static void main(String[] args) throws IOException {
        File helloWorld_java = new File("G:\\Java\\src\\其他\\HelloWorld.java");
        FileOutputStream helloWorld = new FileOutputStream(helloWorld_java);
        helloWorld.write("package 其他;\npublic class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello World!\"); }}".getBytes());
        FileInputStream helloWorld_Read = new FileInputStream(helloWorld_java);
        StringBuilder s = new StringBuilder();
        int read;
        while ((read = helloWorld_Read.read()) != -1) {
            s.append((char) read);
        }
        System.out.println(s);
        helloWorld_Read.close();
        BufferedReader fr = new BufferedReader(new FileReader(helloWorld_java));
        String line;
        while ((line = fr.readLine()) != null) {
            System.out.println(line);
        }
        fr.close();
    }
}
