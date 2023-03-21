package bilbil.面向对象.上.二波;

/**
 * @ codeing=utf-8
 * @Time : 2022/10/26 14:42
 * @Author: 曹志阳
 * @Classname Circle
 * @software :IntelliJ IDEA
 */
public class Circle {
    public static void main ( String[] args ) {
            Circledemo a1 = new Circledemo();
            a1.radius=2;
            double area =a1.findArea();
            System.out.println (String.format("%.2f",area));
    }
}

class Circledemo{

    //属性
    double radius;
    //方法一
    public double findArea(){
        return Math.PI*radius*radius;
    }

}