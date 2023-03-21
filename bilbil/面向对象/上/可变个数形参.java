package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/5/18 19:53
 * @Author: 曹志阳
 * @Classname 可变个数形参
 * @software :IntelliJ IDEA
 */
public class 可变个数形参 {
    /*
    1.jdk 5.0以后的
    2.具体使用
        格式：类型...变量名
        可以传入多个同一类型的实参   0个，一个，2个....多个
        可变个数形参的方法与本类中方法名相同，形参不同的方法构成重载
        可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间构成不了重载
        可变个数形参在方法的形参中，必须在末尾声明
        可变个数形参在方法的形参中，最多只能声明一个可变形参
     */
    public static void main ( String[] args ) {
        可变个数形参 test = new 可变个数形参 ();

        test.show("1","2");
    }
    public void show(int i){

    }
    public void show(String i){

    }
    public void show(String ...strs){
        System.out.println ("show(String ...strs)" );
        for(int i=0; i<strs.length; i++){
            System.out.println (strs[i]);
        }
    }
}
