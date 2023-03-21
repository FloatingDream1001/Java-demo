package java作业;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/25 8:25
 * @Author: 曹志阳
 * @Classname 实验四
 * @software :IntelliJ IDEA
 */
public class 实验四 {
    public static void main ( String[] args ) {
        Students p1 = new Students ( );
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "依次输入名字，年龄，专业" );
        String a = sc.next ( );
        short b = sc.nextShort ( );
        String c = sc.next ( );
        Home p2 = new Home ( );
        p1.name    = a;
        p1.age     = b;
        p1.zhuanye = c;
        p2.dizhi   = "宁夏理工学院";
        p1.read ( );
        p2.read2 ( );
    }
}

class Students {
    String name;
    short age;
    String zhuanye;

    void read () {
        System.out.print ( "大家好我是" + name + "今年" + age + "岁是" + zhuanye + "专业" );
    }
}

class Home {
    String dizhi;

    void read2 () {
        System.out.println ( "是" + dizhi + "的一名学生" );
    }
}