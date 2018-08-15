package Homework.基础班;

public class 敖屹02
{
	public static void main(String[] args)
	{
		System.out.println("\n第一题如下：\n变量是用来存储数据的可变化的量。\n定义格式为：数据类型 标识名 = 值;\n在同一个作用域内不能重复定义标识名相同的变量，使用变量一定要对其赋值。");
		System.out.println("\n第二题如下：\n两类：基本数据类型，引用数据类型。\n基本数据类型：byte,short,int,long; float,double; char; boolean.");
		System.out.println("\n第三题如下：\n第一问中“b=b1+b2;”有问题，b1与b2被隐式转换成了int型，无法将int数据正常赋给byte变量，并且在编译过程中无法判定变量b1与变量b2的值是否在byte类型的范围内，所以会编译失败。\n第二问有问题，130已经超出了byte的赋值范围，所以会编译失败，可以进行强制转换，byte by=(byte)130，但数据会有丢失，结果为by=-126。\n第三问中“b = b + 1”;会失败，因为系统编译时无法判定变量b + 1的值是否在byte的赋值范围内，所以失败。");
		System.out.println("\n第四题如下：\n+运算符的作用:进行加法运算，以及拼接字符串。\n除法得到的是商，而取余则只得到余数。\n分前自增（减），后自增（减）。单独使用时前自增（减）与后自增（减）并无区别，结果都是数值+1（-1）；混合使用时如 num2 = num1++ 则是先将num1的值赋给num2，然后num1再自增；num2 = ++num1 则是先将num1自增，然后将自增后的num1赋值给num2。");
		System.out.println("\n第五题如下：\n加等于+= 减等于-= 乘等于*= 除等于/= 模等于%= 等于=");
		System.out.println("\n第六题如下：\nshort s = 1; s = s + 1;\n有问题，应改为short s = 1; s = (short)(s + 1);或者short s = 1; s += 1;\nshort s = 1; s += 1;\n没有问题。");
		System.out.println("\n第七题如下：\n结果仅为true或false。");
		System.out.println("\n第八题如下：");
			int num=123;
			int num100=num/100, num10=num%100/10, num1=num%10;
			System.out.println("数字123的个位是"+num1+"，十位是"+num10+"，百位是"+num100+"。");
		System.out.println("\n第九题如下：\nx=2,y=26");
	}
}