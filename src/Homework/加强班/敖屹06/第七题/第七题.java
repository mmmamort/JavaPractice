package Homework.加强班.敖屹06.第七题;

public class 第七题 {
    public static void main(String[] args) {
        System.out.println("\n第七题");
        {
            Thread music = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        System.out.println("播放背景音乐" + i);
                    }
                }
            });
            Thread frame = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        System.out.println("画面显示" + i);
                    }
                }
            });
            music.start();
            frame.start();
        }
    }
}
