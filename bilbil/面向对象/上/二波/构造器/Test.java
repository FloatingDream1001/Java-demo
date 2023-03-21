package bilbil.面向对象.上.二波.构造器;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/9 22:50
 * @Author: 曹志阳
 * @Classname Test
 * @software :IntelliJ IDEA
 */

/**
 * 类的结构之三：构造器（构造法、constructor）
 * <p>
 * 一、构造器作用：
 * 创建对象
 * 初始化对象属性
 * <p>
 * 二、说明：
 * 如果没有显示的定义类的构造的话，则系统默认提供一个空参构造器
 * 定义构造器格式：权限修饰符 类名（形参列表）{}
 * 一个类中定义的多个构造器可以重载
 * 一但我们显示了定义了类的构造器之后，系统就不在提供默认空参构造器
 */
public class Test {
    public static void main ( String[] args ) {
        //创建类的对象：new+构造器
        Person p = new Person ( );
        p.eat ( );

        Person p1 = new Person ( "tom" );
        System.out.println ( p1.name );
    }
}

class Person {
    String name;
    int age;

    //构造器
    public Person ( ) {
        System.out.println ( "Person()....." );
    }

    public Person ( String n ) {
        name = n;
    }


    //方法
    public void eat ( ) {
        System.out.println ( "人吃饭" );
    }

    public void study ( ) {
        System.out.println ( "人可以学习" );
    }
}