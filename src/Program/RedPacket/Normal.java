package Program.RedPacket;

import java.util.ArrayList;

public class Normal implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(totalMoney / totalCount);
        }
        list.add(totalCount % totalCount + totalMoney / totalCount);
        return list;
    }
}
