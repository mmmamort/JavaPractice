package Homework.加强班.敖屹05;

import Homework.加强班.敖屹05.第十一题.IntegerFor100Thousands;
import Homework.加强班.敖屹05.第十一题.StringFor100Thousands;
import Homework.加强班.敖屹05.第十一题.StringFor100Thousands2;

public class 敖屹05 {
    public static void main(String[] args) {
/*
        System.out.println("第一题");
        {
            System.out.println("问题一：异常的根类为Throwable,向下分为Error错误与Exception异常，Exception向下分为IOException编译异常、RuntimeException运行异常。");
            System.out.println("问题二：绝症，无能为力。");
            System.out.println("问题三：IOException必须处理，RuntimeException可以不处理。");
            System.out.println("问题四：RuntimeException为编译成功后，运行时出现的语法错误，如超出数组索引范围，超出字符串索引范围。");
        }

        System.out.println("\n第二题");
        {
            System.out.println("问题一：throw使用在方法内，用来抛出一个指定的异常对象给调用者。");
            System.out.println("问题二：throws使用在方法声明上，如果throw抛出了一个异常，而没有进行捕获处理，则必须要有throws来进行异常声明。");
        }

        System.out.println("\n第三题");
        {
            System.out.println("问题一：有两种处理方式，通过throws声明，或通过try…catch捕获。");
            System.out.println("问题二：throws将异常向上抛出，返回给调用者。try…catch捕获try中语句的的异常，遇到catch中规定的异常类，则执行catch中的异常语句。");
        }

        System.out.println("\n第四题");
        {
            System.out.println("ArrayIndexOutOfBoundsException：数组索引超出范围异常，在对数组进行操作时，操作索引超出了数组原有索引范围。");
            System.out.println("StringIndexOutOfBoundsException：字符串索引超出范围异常，在对字符串进行操作时，操作索引超出了数组原有索引范围。");
        }

        System.out.println("\n第五题");
        {
            System.out.println("第一问：空指针异常");
            System.out.println("第二问：数组索引超范围异常");
            System.out.println("第三问：运算异常");
            System.out.println("第四问：数字格式异常");
            System.out.println("第五问：解析异常");
        }

        System.out.println("\n第六题");
        {
            System.out.println("并行指多个事件宏观上在同一时刻进行，并发指多个事件微观上在同一时间段进行");
        }

        System.out.println("\n第七题");
        {
            System.out.println("进程是应用的一次执行过程，一个应用可以有多个进程。");
            System.out.println("线程是进程中的执行单元 ，每个线程都是独立的，一个进程可以有多个线程。");
            System.out.println("一个程序可以运行多个进程，每个进程下可以有多个线程。");
            System.out.println("chrome打开的页面越多，进程也就越多，根据页面加载内容的不同，相应进程的线程也就不同。");
        }

        System.out.println("\n第八题");
        {
            try {
                Student stu1 = new Student(12, "李明", 91);
                Student stu2 = new Student(11, "韩梅梅", -1);
                stu1.checkScore();
                System.out.println(stu1);
                stu2.checkScore();
                System.out.println(stu2);
            } catch (ScoreOutOfBoundsException e) {
                e.getMessage();
            }
        }

        System.out.println("\n第九题");
        {
            EvenNumber1To100 evenNumber = new EvenNumber1To100();
            evenNumber.start();
            for (int i = 1; i < 100; i++) {
                if (i % 2 != 0) System.out.println("线程一中1到100的奇数" + i);
            }
        }

        System.out.println("\n第十题");
        {
            Player p1 = new Player("GM", 100);
            try {
                for (int i = 0; ; i++) {
                    System.out.println(p1.getName() + "当前血量" + p1.getBloodNumber());
                    p1.setBloodNumber(p1.getBloodNumber() - 26);
                    p1.checkBloodNumber();
                }
            } catch (BloodNumberOutOfBoundsExcepution e) {
                e.getMessage();
            }
        }
*/

        System.out.println("\n第十一题");
        {
            new IntegerFor100Thousands().start();
            new StringFor100Thousands().start();
            new StringFor100Thousands2().start();
        }
    }
}
