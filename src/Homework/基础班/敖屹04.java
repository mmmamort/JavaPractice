package Homework.基础班;

public class 敖屹04 {
    public static void main(String[] args) {
        System.out.println("第一题如下：");
        for (int x = 2, z = 0; x <= 100; x++) {
            for (int y = 2; y <= x; y++) {
                if (x % y == 0 && y != x) {
                    break;
                } else if (x % y == 0 && y == x) {
                    z++;
                    System.out.print(x + " \t");
                }
            }
            if (z == 5) {
                z = 0;
                System.out.println();
            }
        }

        System.out.println("\n第二题如下：");
        int high = 8848;
        double thickness = 0.001;
        for (int num = 1; ; num++) {
            thickness += thickness;
            if (thickness > high) {
                System.out.println("折叠 " + num + " 次会超过珠穆朗玛峰的高度。");
                break;
            }
        }

        System.out.println("\n第三题如下：");
        int sum = 0;
        for (int i = 1; 5 * (2 * i + 1) <= 1005; i++) {
            sum += 5 * (2 * i + 1);
        }
        System.out.println("和为" + sum);

        System.out.println("\n第四题如下：");
        for (int j = 1; j <= 5; j++) {
            for (int k = 6 - j; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 1; l <= 4; l++) {
            for (int n = 1; n <= 4 - l; n++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * l - 1; m++) {
                if (m % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("\n第五题如下：");
        //第一问：
        int int1 = 1, int2 = 5;
        double double1 = 1.33, double2 = 3.4222;
        System.out.println("题5.1：");
        sumTwo(int1, int2);//整数和
        sumTwo(double1, double2);//小数和

        //第二问：
        System.out.println("\n题5.2：");
        equal(int1, int2);//整数相等
        equal(double1, double2);//小数相等

        //第三问：
        System.out.println("\n题5.3：");
        compare(int1, int2);//整数大小
        compare(double1, double2);//小数大小

        //第四问：
        System.out.println("\n题5.4：");
        int m = 4, n = 5;
        star(m, n);

        //第五问:
        System.out.println("\n题5.5：");
        int num = 10;
        multiplicationTable(num);

        System.out.println("\n第六题如下：");
        int num1 = 10, num2 = 23;
        System.out.println("" + num1 + " 与 " + num2 + " 中在都不大于21且最接近21的为：" + blackjack(num1, num2));

        System.out.println("\n第七题如下：");
        int number1 = 1, number2 = 1, number3 = 12;
        System.out.println("" + number1 + " 与 " + number2 + " 与 " + number3 + " 的结果为：" + sumThree(number1, number2, number3));

        System.out.println("\n第八题如下：");
        int smaller = 22, bigger = 4, length = 18;
        System.out.println(smaller + "个小砖" + bigger + "和个大砖能否做长度" + length + "的砖：" + makeBricks(smaller, bigger, length));

        System.out.println("\n第九题如下：");
        int thin = 24, heavy = 3, weight = 8;
        System.out.println(thin + "份一公斤巧克力、" + heavy + "份五公斤巧克力，做重量" + weight + "公斤的巧克力至少需要 " + chocolate(thin, heavy, weight) + " 个小巧克力棒。");
    }

    //第五题第一问的调用方法
    public static void sumTwo(int a, int b) {//整数和
        System.out.println(a + " 与 " + b + " 的和为 " + (a + b));
    }

    public static void sumTwo(double a, double b) {//小数和
        System.out.println(a + " 与 " + b + " 的和为 " + (a + b));
    }

    //第五题第二问的调用方法
    public static void equal(int a, int b) {
        if (a == b) {
            System.out.println(a + "相等于" + b);
        } else {
            System.out.println(a + "不相等于" + b);
        }
    }

    public static void equal(double a, double b) {
        if (a == b) {
            System.out.println(a + " 相等于 " + b);
        } else {
            System.out.println(a + " 不相等于 " + b);
        }
    }

    //第五题第三问的调用方法
    public static void compare(int a, int b) {
        System.out.println(a + " 于 " + b + " 的最大值为 " + (a > b ? a : b));
    }

    public static void compare(double a, double b) {
        System.out.println(a + " 于 " + b + " 的最大值为 " + (a > b ? a : b));
    }

    //第五题第四问的调用方法
    public static void star(int m, int n) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //第五题第五问的调用方法
    public static void multiplicationTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }

    //第六题调用的方法
    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21 && b < 21) {
            return b;
        } else if (a < 21 && b > 21) {
            return a;
        } else {
            return a > b ? a : b;
        }
    }

    //第七题调用的方法
    public static int sumThree(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return 0;
        } else if (c == b) {
            return a;
        } else if (a == c) {
            return b;
        } else if (a == b) {
            return c;
        } else {
            return a + b + c;
        }
    }


    //第八题调用的方法
    public static boolean makeBricks(int n1, int n2, int length) {//n1小砖，n2大砖。
        int bigMax = length / 5; //bigMax为五公斤巧克力的最大需求量
        if (n2 >= bigMax) {  //现有五英寸大砖量大等于五英寸大砖的最大需求量，则只考虑一英寸小砖能不能填满剩余部分
            if (n1 >= (length - bigMax * 5)) {
                return true;
            } else {
                return false;
            }
        } else {//现有五英寸大砖量小于五英寸大砖的最大需求量，则只考虑一英寸小砖能不能填满剩
            if (n1 >= (length - n2 * 5)) {//剩余的量不同
                return true;
            } else {
                return false;
            }
        }
    }

    //第九题调用的方法
    public static int chocolate(int n1, int n2, int weight) {//n1 一公斤巧克力，n2 五公斤巧克力
        int bigMax = weight / 5; //bigMax为五公斤巧克力的最大需求量
        if (n2 >= bigMax) {  //现有五公斤巧克力量大等于五公斤巧克力的最大需求量，则只考虑一公斤巧克力能不能填满剩余部分
            if (n1 >= (weight - bigMax * 5)) {
                return weight - bigMax * 5;
            } else {
                return -1;
            }
        } else {//现有五公斤巧克力量小于五公斤巧克力的最大需求量，则只考虑一公斤巧克力能不能填满剩
            if (n1 >= (weight - n2 * 5)) {//剩余的量不同
                return weight - n2 * 5;
            } else {
                return -1;
            }
        }
    }
}


