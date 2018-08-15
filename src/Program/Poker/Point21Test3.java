package Program.Poker;

import java.util.*;

public class Point21Test3 {
    static List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
    static List<String> color = List.of("♠", "♥", "♣", "♦");
    static HashMap<Integer, String> newPoker = new LinkedHashMap<>();
    static ArrayList<Integer> player = new ArrayList();
    static ArrayList<Integer> croupier = new ArrayList();
    static Iterator<Integer> it;
    static boolean flag;

    public static void main(String[] args) {
        System.out.println("开始黑杰克（21点）游戏，规则如下：\n玩家先拿两张明牌，荷官后拿一张明牌、一张暗牌。\n接下来双方要牌，最接近21点的即为胜方，任一方超过21点即为爆牌。\n由玩家先开始，玩家停止要牌后，荷官需先明示暗牌在要牌。\n“A”为11点，当除去“A”牌面值大于10点，“A”为1点。\n");
        /*  准备牌
            创建六副扑克牌，并赋予键值*/
        System.out.println("\"y\"或\"Y\"开始，其他则退出");
        if (new Scanner(System.in).nextLine().equalsIgnoreCase("y")) {
            flag = true;
        }
        while (flag) {//判断是否进行游戏。
            while (true) {//内含游戏主体，用来中途结束游戏。
                int count = 0;
                player.clear();
                croupier.clear();
                for (String numberTemp : number) {
                    for (int i = 0; i < 6; i++) {
                        for (String colorTemp : color) {
                            newPoker.put(count++, colorTemp + numberTemp);
                        }
                    }
                }
                ArrayList<Integer> code = new ArrayList<>(newPoker.keySet());
                Collections.shuffle(code);//洗牌

        /*  发牌
            按21点的规则发牌，先发玩家两张明牌，再发荷官一张明牌一张暗牌*/
                it = code.iterator();
                System.out.println("玩家派牌");
                player.add(it.next());//player.add(0);
                player.add(it.next());// player.add(4);
                //创建玩家面值和变量；
                int sumPlayer = showCard(player);
                System.out.println("荷官派牌");
                croupier.add(it.next());//明
                showCard(croupier);
                croupier.add(it.next());//暗
                //玩家要牌
                System.out.println("玩家要牌：");
                sumPlayer = getCard(sumPlayer, player);
                if (sumPlayer > 21) {
                    System.out.println("玩家爆了，荷官赢");
                    break;
                }
                //创建荷官面值和变量；
                int sumCroupier = showCard(croupier);//暗牌明牌
                //荷官要牌
                System.out.println("荷官要牌：");
                sumCroupier = getCard(sumCroupier, croupier);
                if (sumCroupier > 21) {
                    System.out.println("荷官爆了，玩家赢");
                    break;
                } else if (sumCroupier > sumPlayer)
                    System.out.println("玩家" + sumPlayer + "点，" + "荷官" + sumCroupier + "点，荷官赢");
                else if (sumCroupier == sumPlayer)
                    System.out.println("玩家" + sumPlayer + "点，" + "荷官" + sumCroupier + "点，双方和");
                else if (sumCroupier < sumPlayer)
                    System.out.println("玩家" + sumPlayer + "点，" + "荷官" + sumCroupier + "点，玩家赢");
                break;
            }
            System.out.println("\n是否重新开始，\"y\"或\"Y\"开始，其他则退出");
            if (new Scanner(System.in).nextLine().equalsIgnoreCase("y")) {
                flag = true;
            } else flag = false;
        }
        System.out.println("游戏退出");
    }

    //遍历元素，将键值转换成值
    public static int showCard(ArrayList<Integer> list) {
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

    public static int getCard(int sum, ArrayList<Integer> who) {
        if (sum == 21) {
            System.out.println("黑杰克完成，当前点数21点，停止要牌");
        } else {
            while (sum < 21) {
                System.out.println("\"y\"或\"Y\"要牌，除此则为不要");
                if (new Scanner(System.in).nextLine().equalsIgnoreCase("y")) {
                    who.add(it.next());//player.add(new Scanner(System.in).nextInt());
                    sum = showCard(who);
                } else break;
            }
        }
        return sum;
    }
}
