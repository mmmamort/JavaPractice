package 其他;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

public class 空白 {
    public static void main(String[] args) {
        try {
            AudioClip op = Applet.newAudioClip(new File("C:\\Users\\Eason\\Desktop\\岩崎文紀 - ルフィvsラチェット Round 1.mp3").toURL());
            op.loop();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}