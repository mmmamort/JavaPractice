package Practice;

import java.util.Random;

public class random_az {
    public static void main(String[] args) {
        Random rd = new Random();
        int length = rd.nextInt(100);
        char[] ch = new char[length];
        byte byt;
        for (int i = 0; i < length; i++) {
            ch[i] = (char) (rd.nextInt(26) + 97);
        }
        /*byte[] byt = new byte[num];
        rd.nextBytes(byt);
        for (int i = 0; i < num; i++) {
            ch[i] = (char) byt[i];
        }*/
        String s = new String(ch);
        System.out.println(s);
    }
}