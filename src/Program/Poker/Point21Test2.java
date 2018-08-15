package Program.Poker;

import java.util.*;

public class Point21Test2 {
    static HashMap<Integer, String> newPoker = new LinkedHashMap<>();
    static ArrayList<Integer> player = new ArrayList();
    static ArrayList<Integer> croupier = new ArrayList();

    public static void main(String[] args) {
        /*  准备牌
            创建一副扑克牌，并赋予键值*/
        List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        List<String> color = List.of("♠", "♥", "♣", "♦");
        int count = 0;
        for (String numberTemp : number) {
            for (String colorTemp : color) {
                newPoker.put(count++, colorTemp + numberTemp);
            }
        }
        ArrayList<Integer> code = new ArrayList<>(newPoker.keySet());
        System.out.println(newPoker);
        Collections.shuffle(code);

        Iterator<Integer> it = code.iterator();
        /*  发牌
            按21点的规则发牌，先发玩家两张明牌，再发荷官一张明牌一张暗牌*/
        System.out.println("玩家拍牌");
        player.add(it.next());//player.add(0);
        player.add(it.next());// player.add(4);
        //创建玩家面值和变量；
        int sumPlayer = getCard(player);
        System.out.println("荷官拍牌");
        croupier.add(it.next());//明
        getCard(croupier);
        croupier.add(it.next());//暗
        //玩家要牌
        System.out.println("玩家要牌：\"y\"或\"Y\"要牌，除此则为不要");
        while (sumPlayer < 21 && new Scanner(System.in).nextLine().equalsIgnoreCase("y")) {
            player.add(it.next());//player.add(new Scanner(System.in).nextInt());
            sumPlayer = getCard(player);
        }
        if (sumPlayer > 21) {
            System.out.println("玩家爆了，荷官赢");
            return;
        }
        //创建荷官面值和变量；
        int sumCroupier = getCard(croupier);//暗牌明牌
        //荷官要牌
        System.out.println("荷官要牌：\"y\"或\"Y\"要牌，除此则为不要");
        while (sumCroupier < 21 && new Scanner(System.in).nextLine().equalsIgnoreCase("y")) {
            croupier.add(it.next());
            sumCroupier = getCard(croupier);
        }
        if (sumCroupier > 21) {
            System.out.println("荷官爆了，玩家赢");
            return;
        } else if (sumCroupier > sumPlayer) System.out.println("玩家" + sumPlayer + "点，" + "荷官" + sumCroupier + "点，荷官赢");
        else if (sumCroupier == sumPlayer) System.out.println("玩家" + sumPlayer + "点，" + "荷官" + sumCroupier + "点，双方和");
        else if (sumCroupier < sumPlayer) System.out.println("玩家" + sumPlayer + "点，" + "荷官" + sumCroupier + "点，玩家赢");
    }

    //遍历元素，将键值转换成值
    public static int getCard(ArrayList<Integer> list) {
        ArrayList<String> temp = new ArrayList<>();
        for (Integer integer : list) {
            temp.add(newPoker.get(integer));
        }
        System.out.println(temp + " " + over21(temp) + "点");
        return over21(temp);//获取数值和
    }

    //统计面值
    public static int over21(ArrayList<String> list) {
        List<Character> cardPlain = List.of('2', '3', '4', '5', '6', '7', '8', '9');
        List<Character> cardFace = List.of('0', 'J', 'Q', 'K');
        Character cardA = 'A';
        int sum = 0, countA = 0;
        //统计不可变的poker面值和；
        for (String s : list) {
            for (int i = 0; i < cardPlain.size(); i++) {//素牌
                if (s.charAt(s.length() - 1) == cardPlain.get(i)) sum += i + 2;
            }
            for (int j = 0; j < cardFace.size(); j++) {//花牌及10
                if (s.charAt(s.length() - 1) == cardFace.get(j)) sum += 10;
            }
        }
        //单独考虑A的面值；
        for (String s : list) {
            if (s.charAt(s.length() - 1) == cardA) countA++;
        }
        if (countA > 0) {
            if (sum > 10) sum += countA;//7,9,A
            else if (sum + 11 + countA - 1 > 21) sum += countA;//2,A,A,A,7
            else sum += 11 + countA - 1;//2,A,A,A,6
        }
        return sum;
    }
}
