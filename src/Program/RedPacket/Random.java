package Program.RedPacket;


import java.util.ArrayList;

public class Random implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        java.util.Random rd = new java.util.Random();
        int time = totalCount, money;
        for (int i = 0; i < totalCount - 1; i++) {
            money = new java.util.Random().nextInt(totalMoney / time * 2) + 1;
            list.add(money);
            totalMoney -= money;
            time--;
        }
        list.add(totalMoney);
        return list;
    }
}
