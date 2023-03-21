package bilbil.面向对象.上.二波.封装与隐藏;

//Java规定的四种权限（从小到大）：private 、缺省、protectes、public
//4种权限都可以来修饰类及类的内部结构：属性、方法、构造器、内部类
//具体的，4种权限可以修饰的内部结构：属性、方法、构造器、内部类
//                        修饰类只能用缺省、public
/**
 *
 * @ codeing=utf-8
 * @Time : 2022/11/9 21:43
 * @Author: 曹志阳
 * @Classname 封装和隐藏
 * @software :IntelliJ IDEA
 */
public class 封装和隐藏 {
    public static void main ( String[] args ) {
        Animal a=new Animal();
        a.name = "haha";
        a.age=10;
        a.setlegs(4);
        a.show ( );
        int s=a.GetLegs();
        System.out.println (s );

    }
}
class Animal{
    String name;
    int age;
    private int legs;//腿的个数  隐藏起来，用别的方法修改值  此时对于属性就是封装性
    //对属性设置
    public void setlegs( int l){
        if ( l >= 0 && l % 2 == 0 ) {
            legs = l;
        }else{
            legs = 0;
        }
    }
    //对属性获取
    public int GetLegs(){
        return legs;
    }
    public void eat(){
        System.out.println ("动物进食" );
    }
    //方法1
//    public void show(){
//        setlegs(legs);
//        System.out.println ("name="+name+" age="+age+" legs="+legs);
//    }

    //私有化
        public void show() {
            System.out.println ( "name=" + name + " age=" + age + " legs=" + legs );
        }
}


