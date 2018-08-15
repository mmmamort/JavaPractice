package Homework.基础班.敖屹06;

public class 敖屹06 {
    public static void main(String[] args) {
        System.out.println("第一题如下：\n面向对象是一种设计思想，强调将属性与行为进行抽离，然后通过调用属性与行为来实现需要的功能。");

        System.out.println("\n第二题如下：\n封装，寄存，多态。");

        System.out.println("\n第三题如下：\n类是具有相关属性和行为的事物的集合。\n属性是事物的状态信息。");

        System.out.println("\n第四题如下：\n通过使用对象访问类中成员：\n对象名.成员变量；\n" + "对象名.成员方法()；");

        System.out.println("\n第五题如下：\n成员变量作用范围为当前类，局部变量的作用范围只在当前{}内。");

        System.out.println("\n第六题如下：\nJava语言最基本的单位是 类\n计算机能直接是别的进制是 二进制\n计算机最小的存储单位是 字节");

        System.out.println("\n第八题如下：\n封装就是将数据和代码附加权限，将其隐藏并保护起来，只能通过公共访问方式访问，防止外部肆意访问更改数据代码。");

        System.out.println("\n第九题如下：\n不对，private是Java语言的一种封装方法。");

        System.out.println("\n第十题如下：\nthis是用来区分成员变量、局部变量。");

        System.out.println("\n第十一题如下：");
        System.out.println("\n需求一：");
        Phone myPhone = new Phone("苹果", 10000);
        System.out.println("品牌为：" + myPhone.getBrand() + "    价格为：" + myPhone.getPrice());
        myPhone.call("李明");
        myPhone.sendMessage("韩梅梅");
        myPhone.playGame("小学英语");


        System.out.println("\n需求二：");
        Person man = new Person("王小明", 13, "男");
        System.out.println("姓名：" + man.getName() + " 年龄：" + man.getAge() + "岁 性别：" + man.getGender());
        man.sleep(8);
        man.study(23);

        System.out.println("\n需求三：");
        Animal bird = new Animal();
        bird.setName("老大");
        bird.setAge(2);
        System.out.println("小鸟的名字叫：" + bird.getName() + " 年龄：" + bird.getAge() + "岁");
        bird.eatFood("瓜子");

        System.out.println("\n需求四：");
        Dog hasky = new Dog("拆迁大队特种狗", 1);
        System.out.println("我家的狗名字叫：" + hasky.getName() + " 年龄：" + hasky.getAge() + "岁。");
        hasky.eatFood("骨头");
        hasky.action("看家");

        System.out.println("\n需求五：");
        Cat cat = new Cat();
        cat.setName("汤姆");
        cat.setAge(5);
        System.out.println("猫的名字叫：" + cat.getName() + " 年龄：" + cat.getAge() + "岁。");
        cat.eatFood("杰瑞");
        cat.action("抓老鼠");

        System.out.println("\n需求六：");
        Student someOne = new Student(91,87,96);
        System.out.println("语文成绩" + someOne.getChineseScore() + "数学成绩" + someOne.getMathScore() + "英语成绩" + someOne.getEnglishScore() + "\n总成绩" + someOne.getSum());
    }
}
