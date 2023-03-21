package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/5/1 15:01
 * @Author: 曹志阳
 * @Classname 匿名对象
 * @software :IntelliJ IDEA
 */

/**
 * 匿名对象使用
 * 1、理解，我们创建的对象，没有显示的赋给一个变量名，即为匿名对象
 * 2、特征，匿名对象只能使用一次
 *
 */
public class 匿名对象 {
    public static void main ( String[] args ) {
        //一般使用
        phone p=new phone();
//        p.sendEmail ();
        //匿名对象
        //每new一个,堆内存就多一个内容不一
        new phone().price=1988;
        new phone().showprice();
        //匿名对象的使用
        phonemain mail = new phonemain();
        mail.show ( new phone() );



    }
}
class phonemain{
    public void show(phone call){
        call.sendEmail();
        call.showprice ();
    }


}
class phone{
    double price=1999;
    public void sendEmail(){
        System.out.println ("发邮件" );

    }
    public void showprice(){
        System.out.println ("手机价格为"+price );
    }
}