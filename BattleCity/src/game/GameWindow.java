package game;


import domain.*;
import gameInterface.*;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import tool.DrawUtils;
import tool.SoundUtils;
import tool.Window;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;


public class GameWindow extends Window {
    //开场音乐路径
    String op = "BattleCity\\res\\snd\\GMRemix-FC_坦克大战.wav";
    //创建element集合对象
    CopyOnWriteArrayList<Element> list = new CopyOnWriteArrayList<>();
    //创建我方坦克对象
    MyTank myTank;
    //创建敌方坦克对象
    EnemyTank enemyTank;

    public GameWindow(String title, int width, int height, int fps) {
        super(title, width, height, fps);
    }

    @Override
    protected void onCreate() {
        //只会执行一次
        //执行一次开场音乐
        try {
            SoundUtils.play(op, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //1为wall,2为steel,3为water,4为grass
        list = readExcelMap(new File("BattleCity\\res\\map\\map.xls"));
        list.add(new Bomb(new Random().nextInt(14) * 64, new Random().nextInt(14) * 64));
        list.add(new Star(new Random().nextInt(14) * 64, new Random().nextInt(14) * 64));
         /*
        根据渲染级别对集合进行排序,渲染级别越高的元素,就排在最后,那么也就意味着越晚绘制
         */
        Collections.sort(list, new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o1.getOrder() - o2.getOrder();
            }
        });
    }

    /**
     * 鼠标down事件
     *
     * @param key 0为左键 1为右键
     * @param x   x坐标
     * @param y   y坐标
     */
    @Override
    protected void onMouseEvent(int key, int x, int y) {
    }

    /**
     * 按键事件
     *
     * @param key 按键，{@code Keyboard.key_xx}
     */
    Boolean sndFlag = false;
    Boolean startFlag = true;

    @Override
    protected void onKeyEvent(int key) {
        try {
            if (key == Keyboard.KEY_RETURN && startFlag) {
                startFlag = false;
            }
            //Esc控制音乐开关
            if (key == Keyboard.KEY_ESCAPE) {
                if (sndFlag) {
                    SoundUtils.play(op, true);
                    //延时方法，防止按键粘连
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sndFlag = false;
                } else {
                    SoundUtils.stop(op);
                    //延时方法，防止按键粘连
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sndFlag = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //响应键盘事件控制myTank
        if (key == Keyboard.KEY_UP) {
            myTank.move(Direction.UP);
        } else if (key == Keyboard.KEY_DOWN) {
            myTank.move(Direction.DOWN);
        } else if (key == Keyboard.KEY_LEFT) {
            myTank.move(Direction.LEFT);
        } else if (key == Keyboard.KEY_RIGHT) {
            myTank.move(Direction.RIGHT);
        }
        //空格发射子弹
        if (key == Keyboard.KEY_SPACE) {
            Bullet bullet = myTank.shoot();
            if (bullet != null) list.add(bullet);
        }
    }

    /**
     * 当屏幕刷新时的回调
     */
    long lastTime = 0;
    long nowTime = 0;
    boolean timeFlag = true;

    @Override
    protected void onDisplayUpdate() {
        if (startFlag) {
            int width = 0;
            int height = 0;
            try {
                int[] size = DrawUtils.getSize("BattleCity\\res\\img\\start.jpg");
                width = size[0];
                height = size[1];
                DrawUtils.draw("BattleCity\\res\\img\\start.jpg", (Config.WIDTH - width) / 2, (Config.HEIGHT - height) / 2);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            if (myTank.getBlood() == 0) {
                if (timeFlag) {
                    lastTime = System.currentTimeMillis();
                    timeFlag = false;
                }
                int width = 0;
                int height = 0;
                try {
                    int[] size = DrawUtils.getSize("BattleCity\\res\\img\\over.gif");
                    width = size[0];
                    height = size[1];
                    list.clear();
                    DrawUtils.draw("BattleCity\\res\\img\\over.gif", (Config.WIDTH - width) / 2, (Config.HEIGHT - height) / 2);
                    nowTime = System.currentTimeMillis();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (nowTime - lastTime > 3000) System.exit(0);
            }
            for (Element e : list) {
                if (e instanceof EnemyTank) {
                    ((EnemyTank) e).move();
                    int num = new Random().nextInt(100);
                    if (num == 1) {
                        Bullet bullet = ((EnemyTank) e).shoot();
                        if (bullet != null) {
                            list.add(bullet);
                        }
                    }
                }
            }
            for (Element e : list) {
                if (e instanceof Destroyable)
                    if (((Destroyable) e).isDestroy())
                        list.remove(e);
            }
            //绘制图片
            for (Element e : list) {
                if (e != null)
                    e.draw();
            }
            for (Element e : list) {//方块碰撞
                if (e instanceof Moveable) for (Element e1 : list) {//Moveable子类对象去调用checkHit方法检测Blockable子类对象
                    if (e1 == e) continue;//防止坦克对象重复
                    if (e1 instanceof Blockable)
                        // if (e1 instanceof Tank && e instanceof Tank) if (((Moveable) e).checkHit2((Blockable) e1)) break;
                        if (((Moveable) e).checkHit((Blockable) e1)) {
                            if (e instanceof MyTank && e1 instanceof Tools) {
                                list.remove(e1);
                                if (e1 instanceof Bomb) {
                                    for (Element element : list)
                                        if (element instanceof EnemyTank) {
                                            ((EnemyTank) element).blood = 1;//重置敌方坦克血量
                                            list.add(((EnemyTank) element).showAttack());
                                        }
                                }
                                if (e1 instanceof Star) {
                                    for (Element element : list)
                                        if (element instanceof Steel) {
                                            ((Steel) element).breakableFlag = true;
                                        }
                                }
                            }
                            if (e1 instanceof Tank && e instanceof Tank) ((Tank) e).badDistance /= 2;//防止双方都是坦克时发生碰撞时穿模
                            break;
                        }
                }
            }
            for (Element e : list) {//子弹碰撞
                if (e instanceof Attackable) for (Element e1 : list) {
                    if (e1 instanceof Hitable) {
                        if (e == e1) continue;
                        Bullet bullet = (Bullet) e;
                        if (bullet.tank.getClass() == e1.getClass()) continue;
                        if (e1 instanceof Bullet) {
                            Bullet bullet1 = (Bullet) e1;
                            if (bullet.tank.getClass() == bullet1.tank.getClass()) continue;
                        }
                        if (((Attackable) e).checkAttack((Hitable) e1)) {
                            list.remove(e);
                            Hitable hitable = (Hitable) e1;
                            list.add(hitable.showAttack());
                            break;
                        }
                    }
                }
            }
        }
    }

    //读取可编辑地图excel文件
    public CopyOnWriteArrayList<Element> readExcelMap(File file) {
        try {
            // 创建输入流，读取Excel
            InputStream is = new FileInputStream(file);
            // jxl提供的Workbook类
            Workbook wb = Workbook.getWorkbook(is);
            // Excel的页签数量
            CopyOnWriteArrayList<Element> elementList = new CopyOnWriteArrayList();
            // 每个页签创建一个Sheet对象
            Sheet sheet = wb.getSheet(0);
            //创建元素存储变量
            int element;
            // sheet.getRows()返回该页的总行数
            for (int i = 0; i < sheet.getRows(); i++) {
                // sheet.getColumns()返回该页的总列数
                for (int j = 0; j < sheet.getColumns(); j++) {
                    element = sheet.getCell(j, i).getContents().equals("") ? 0 : Integer.parseInt(sheet.getCell(j, i).getContents());
                    /*if (sheet.getCell(j, i).getContents().equals("")) element = 0;
                    else element = Integer.parseInt(sheet.getCell(j, i).getContents());*/
                    switch (element) {
                        case 1:
                            Element wall = new Wall(64 * j, 64 * i);
                            elementList.add(wall);
                            break;
                        case 2:
                            Element steel = new Steel(64 * j, 64 * i);
                            elementList.add(steel);
                            break;
                        case 3:
                            Element water = new Water(64 * j, 64 * i);
                            elementList.add(water);
                            break;
                        case 4:
                            Element grass = new Grass(64 * j, 64 * i);
                            elementList.add(grass);
                            break;
                        case 5:
                            myTank = new MyTank(64 * j, 64 * i);
                            elementList.add(myTank);
                            break;
                        case 6:
                            enemyTank = new EnemyTank(64 * j, 64 * i);
                            elementList.add(enemyTank);
                            break;
                    }
                }
            }
            return elementList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
