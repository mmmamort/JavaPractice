package Homework.基础班;

public class 敖屹03 {
    public static void main(String[] args)
    {
        System.out.println("第一题如下：\nif语句的三种格式：\nif\nif...else\nif...else if...else");
        System.out.println("\n第二题如下：\nswitch(表达式) {\ncase 常量值1:\n语句体1;\nbreak;\n...\ncase 常量值n:\n语句体n;\nbreak;\ndefault:\n语句体n+1;\nbreak;");
        System.out.println("\n第三题如下：");
            int int1 = 123, int2 = 123;
            if(int1 == int2)
            {
                System.out.println(""+int1+" 与 "+int2+" 相同");
            }
            else
            {
                System.out.println(""+int1+" 与 "+int2+" 不相同");
            }
        System.out.println("\n第四题如下：");
            int first = 123, second = 321;
            int max1 = first > second ? first : second;
            System.out.println(""+first+" 与 "+second+" 两者的最大值为："+max1);
        System.out.println("\n第五题如下：");
            double score = 100;
            if(score > 100 || score < 0)
            {
                System.out.println("非法输入");
            }
            else if(score <= 100 && score >= 90)
            {
                System.out.println("A等");
            }
            else if(score <= 89 && score >= 80)
            {
                System.out.println("B等");
            }
            else if(score <= 79 && score >= 70)
            {
                System.out.println("C等");
            }
            else if(score <= 69 && score >= 60)
            {
                System.out.println("D等");
            }
            else
            {
                System.out.println("E等");
            }
        System.out.println("\n第六题如下：");
            int year = 7, laborage = 3000, add = 0 , laborage_sum = 0;
            if(year >= 15 || year < 0 )
            {
                System.out.println("非法输入");
            }
            else if(year < 15 && year >= 10)
            {
                add = 5000;
                laborage_sum = laborage + add;
            }
            else if(year < 10 && year >= 5)
            {
                add = 2500;
                laborage_sum = laborage + add;
            }
            else if(year < 3 && year >= 5)
            {
                add = 1000;
                laborage_sum = laborage + add;
            }
            else if(year < 3 && year >= 1)
            {
                add = 500;
                laborage_sum = laborage + add;
            }
            else
            {
                add = 200;
                laborage_sum = laborage + add;
            }
        System.out.println("您目前工作了"+year+"年，基本工资为"+laborage+"元，应涨工资"+add+"元，涨后工资"+laborage_sum+"元。");
        System.out.println("\n第七题如下：\ny=5");
        System.out.println("\n第八题如下：");
                int max,a = 123 , b = 213 , c = 312;
            if(a >= b)
            {
                max = a;
                if(max < c)
                {
                    max = c;
                }
            }
            else
            {
                max = b;
                if(max < c)
                {
                    max = c;
                }
            }
            System.out.println("数字"+a+"，"+b+"，"+c+"的最大值为"+max);
        System.out.println("\n第九题如下：");
            int month = 10;
            switch (month)
            {
                case 3:
                case 4:
                case 5:System.out.println("夏季");break;
                case 6:
                case 7:
                case 8:System.out.println("秋季");break;
                case 9:
                case 10:
                case 11:System.out.println("冬季");break;
                case 12:
                case 1:
                case 2: System.out.println("春季");break;
                default:System.out.println("非法输入");
            }
        System.out.println("\n第十题如下：");
            for (int num = 1 ; num < 100 ; num++)
            {
                if(num / 10 == 9 || num % 10 == 9)
                {
                    continue;
                }
                System.out.println(num);
            }
    }
}
