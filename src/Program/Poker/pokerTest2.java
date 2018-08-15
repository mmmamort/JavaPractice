package Program.Poker;

import java.util.*;

public class pokerTest2 {
    public static void main(String[] args) {
        /*  准备牌
            创建一副扑克牌，并赋予键值*/
        List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        List<String> color = List.of("♠", "♥", "♣", "♦");
        HashMap<Integer, String> newPoker = new LinkedHashMap<>();
        int count = 0;
        newPoker.put(count++, "♚");
        newPoker.put(count++, "♔");
        for (String numberTemp : number) {
            for (String colorTemp : color) {
                newPoker.put(count++, colorTemp + numberTemp);
            }
        }
        /*  发牌
            按照键值打乱顺序，并发牌*/
        ArrayList<Integer> pokerCode = new ArrayList<>(newPoker.keySet());
        Collections.shuffle(pokerCode);
        System.out.println(pokerCode);
        //创建迭代器发牌,添加3个玩家对象和底牌对象；
        ArrayList p1 = new ArrayList<>();//不设置集合泛型，用来存取integer pokerCode及相应的string newPoler值
        ArrayList p2 = new ArrayList<>();
        ArrayList p3 = new ArrayList<>();
        ArrayList dipai = new ArrayList<>();
        Iterator it = pokerCode.iterator();
        for (int i = 0; i < pokerCode.size() / 3; i++) {
            if (i < (pokerCode.size() - 3) / 3) {
                p1.add(it.next());
                p2.add(it.next());
                p3.add(it.next());
            } else for (int i1 = 0; i1 < 3; i1++) {
                dipai.add(it.next());
            }
        }
        /*  看牌
            排序并打印*/
        getCard(p1, newPoker);
        getCard(p2, newPoker);
        getCard(p3, newPoker);
        getCard(dipai, newPoker);
    }

    public static void getCard(ArrayList list, HashMap map) {
        Collections.sort(list);
        int count = 0;
        for (Object o : list) {
            list.set(count++, map.get(o));
        }
        System.out.println(list);
    }
}

