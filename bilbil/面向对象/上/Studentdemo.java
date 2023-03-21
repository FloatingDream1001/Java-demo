package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 16:41
 * @Author: 曹志阳
 * @Classname Studentdemo
 * @software :IntelliJ IDEA
 */
public class Studentdemo {
    public static void main ( String[] args ) {
//        创建对象
        Student p1=new Student ();
//        使用对象
        System.out.println (p1.name+","+p1.age );
        p1.name="张三";
        p1.age=23;
        p1.study ();
        p1.doHomework ();

    }
}
