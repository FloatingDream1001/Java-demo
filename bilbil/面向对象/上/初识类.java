package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 15:42
 * @Author: 曹志阳
 * @Classname 初识对象
 * @software :IntelliJ IDEA
 */
public class 初识类 {
    public static void main ( String[] args ) {
//        创建类的对象=类的实例化
        Phone p1=new Phone ();
//        使用成员变量
        System.out.println (p1.brand );
        System.out.println (p1.phone );
//        给成员变量赋值
        p1.brand="小米";
        p1.phone=2999;
        System.out.println (p1.brand );
        System.out.println (p1.phone );
//        使用成员方法
        p1.call ();
        p1.SendMassage ();
    }

}
    class Phone{
//    成员变量，属性
    String brand;
    int phone;
//    成员方法
    public void call(){
        System.out.println ("打电话" );
    }
    public void SendMassage(){
        System.out.println ("发短信" );
    }

}
