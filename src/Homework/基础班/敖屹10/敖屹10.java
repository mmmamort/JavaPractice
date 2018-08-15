package Homework.基础班.敖屹10;


import Homework.基础班.敖屹09.PartDog;
import Homework.基础班.敖屹10.第一题.Sum;
import Homework.基础班.敖屹10.第一题.Sum1_10;
import Homework.基础班.敖屹10.第二题.Animal;
import Homework.基础班.敖屹10.第二题.Cat;
import Homework.基础班.敖屹10.第二题.Dog;
import Homework.基础班.敖屹10.第三题.Max;
import Homework.基础班.敖屹10.第三题.MaxNum;
import Homework.基础班.敖屹10.第五题.需求五.*;
import Homework.基础班.敖屹10.第四题.*;
import Homework.基础班.敖屹10.第五题.需求一.BasicTeacher;
import Homework.基础班.敖屹10.第五题.需求一.EmploymentTeacher;
import Homework.基础班.敖屹10.第五题.需求一.Teach;
import Homework.基础班.敖屹10.第五题.需求二.BasicStudent;
import Homework.基础班.敖屹10.第五题.需求二.EmploymentStudent;
import Homework.基础班.敖屹10.第五题.需求二.Study;
import Homework.基础班.敖屹10.第五题.需求三.AnimalEat;
import Homework.基础班.敖屹10.第五题.需求三.Cat1;
import Homework.基础班.敖屹10.第五题.需求三.Dog1;
import Homework.基础班.敖屹10.第五题.需求四.Play;
import Homework.基础班.敖屹10.第五题.需求四.PlayGame;

public class 敖屹10 {
    public static void main(String[] args) {
        System.out.println("第一题如下：");
        Sum sum1To10 = new Sum1_10();
        System.out.println("1~10以内(包含1和10)能被2整除但是不能被3整除的数的和为：" + sum1To10.sum());

        System.out.println("\n第二题如下：");
        Cat cat = new Cat();
        Dog dog = new Dog();
        method(cat);
        method1(dog);
        method2(cat);

        System.out.println("\n第三题如下：");
        Max max = new MaxNum();
        max.maxNum(max.setArr());

        System.out.println("\n第四题如下：");
        Teacher teacher = new Teacher("杰克", 33);
        Student student = new Student("路飞", 18);
        teacher.info();
        student.info();
        Behaviour partTeacher = new PartTeacher("日斩", 70);
        Behaviour partStudent = new PartStudent("自来也", 50);
        partTeacher.info();
        partStudent.info();

        System.out.println("\n第五题如下：");
        System.out.println("需求一：");
        Teach basicTeacher = new BasicTeacher("李阳", 33);
        basicTeacher.teach();
        Teach employmentTeacher = new EmploymentTeacher("阳李", 38);
        employmentTeacher.teach();

        System.out.println("\n需求二：");
        Study basicStudent = new BasicStudent("李明", 18);
        basicStudent.study();
        Study employmentStudent = new EmploymentStudent("韩梅梅", 19);
        employmentStudent.study();

        System.out.println("\n需求三：");
        Cat1 cat1 = new Cat1("黑白", 4);
        Dog1 dog1 = new Dog1("黄", 4);
        animalEat(cat1);
        cat1.catchMouse();
        animalEat(dog1);
        dog1.lookHome();

        System.out.println("\n需求四：");
        Play playGame = new PlayGame();
        playGame.playGame();

        System.out.println("\n需求五：");
        Cat2 cat2 = new Cat2("大白", 3);
        cat2.info();
        Dog2 dog2 = new Dog2("大黑", 4);
        dog2.info();
        Jump superCat = new PartCat("小白", 1);
        superCat.info();
        Jump superDog = new PartDog("小黑", 2);
        superDog.info();
    }

    //第二题的方法
    public static void method(Cat cat) {
        cat.eat();
    }

    public static void method1(Dog dog) {
        dog.eat();
    }

    public static void method2(Animal animal) {
        animal.eat();
    }

    //第五题需求三的方法
    public static void animalEat(AnimalEat animal) {
        animal.information();
        animal.eat();
    }

}
