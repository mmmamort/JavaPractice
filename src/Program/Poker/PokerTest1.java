package Program.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PokerTest1 implements Comparable<String> {
    public static final char[] COLOR_NUM = {'♚', '♔', '2', 'A', 'K', 'Q', 'J'};

    public static void main(String[] args) {
        /*    准备牌：
            牌可以设计为一个ArrayList,每个字符串为一张牌。 每张牌由花色数字两部分组成，我们可以使用花色
            集合与数字集合嵌套迭代完成每张牌的组装。 牌由Collections类的shuffle方法进行随机排序。*/
        ArrayList<String> color = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♦");
        color.add("♣");
        ArrayList<String> number = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        ArrayList<String> poker = new ArrayList<>();
        for (String c : color) {
            for (String n : number) {
                poker.add(c + n);
            }
        }
        poker.add("♚");
        poker.add("♔");
        /*    排序
         */
        Collections.shuffle(poker);
        System.out.println(poker);
        /*    发牌
            将每个人以及底牌设计为ArrayList,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。*/
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> landlordCard = new ArrayList<>();
        Iterator<String> it = poker.iterator();
        //发18次牌
        for (int l = 0; l < poker.size() / 3; l++) {
            //发17次牌给玩家p1,p2,p3
            if (l < (poker.size() - 3) / 3) {
                p1.add(it.next());
                p2.add(it.next());
                p3.add(it.next());
            } else {
                //最后3张为地主牌
                for (int m = 0; m < 3; m++) {
                    landlordCard.add(it.next());
                }
            }
        }
        /*    看牌
              直接打印每个集合*/
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(landlordCard);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
