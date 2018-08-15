package game;

import gameInterface.Config;

public class App {
    public static void main(String[] args) {
        GameWindow window = new GameWindow(Config.TITLE, Config.WIDTH, Config.HEIGHT, Config.FPS);
        window.start();
        }
}
