package Program.RedPacket;

public class Test {
    public static void main(String[] args) {
        RedPacket redPacket = new RedPacket("超级红包");
        redPacket.setOwnerName("彭老师");
        redPacket.setOpenWay(new Random());
    }
}
