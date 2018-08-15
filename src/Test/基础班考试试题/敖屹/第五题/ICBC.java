package Test.基础班考试试题.敖屹.第五题;

public class ICBC extends Card implements Credit {
    public ICBC(String name) {
        super(name);
    }

    public ICBC() {
    }

    @Override
    public void cardholder(Person p) {
        System.out.println(p.getName() + "使用的是" +getName() + "信用卡");
    }

    @Override
    public void prepaid() {
        System.out.println("信用卡可以先消费");
    }

}
