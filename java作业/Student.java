package java作业;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/25 9:23
 * @Author: 曹志阳
 * @Classname Student
 * @software :IntelliJ IDEA
 */
public class Student {
    String name;;
    short age;
    String zhuanye;
    void read(){
        System.out.println ("大家好我是" + name + "今年" + age + "岁是" + zhuanye + "专业"  );
    }
    Student(){
        System.out.println ("未填报" );

    }
    Student(String name,Short age,String zhuanye){
        this.name=name;
        this.age=age;
        this.zhuanye=zhuanye;
    }
    Student(String name,Short age){
        this.name=name;
        this.age=age;
        System.out.println ("大一新生专业未分" );}
    Student(String name){
        this.name=name;
        System.out.println ("对方年龄专业未知" );}
}
