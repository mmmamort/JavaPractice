package Test.基础班考试试题.敖屹.第五题;

public class Test {
    public static void main(String[] args) {
        ICBC bank = new ICBC("工商银行");
        Person p = new Person("张三");
        bank.prepaid();
        bank.save();
        bank.cardholder(p);
    }
}
