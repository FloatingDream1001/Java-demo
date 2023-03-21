package bilbil.面向对象.上.二波.this关键字;

/**
 * this关键字的使用
 * 1.this可以用来修饰：属性、方法、构造器
 * 2.在构造器中使用this必须在首行，只能调一个（减少代码冗余）
 *
 * 2.this修饰属性和方法
 *      this理解为：当前对象
 *
 *      在类的方法中，我们可以使用“this.属性"或this.方法，调用当前属性和方法和构造器内。
 *      但通常情况下，我们可以省略，但方法的形参和属性同名时， 我们必须显示使用。
 *
 *      构造器this,可以把其他重载构造器方法一并用，不用在重新定义相同内容
 *
 */
public class Persontest {
    public static void main ( String[] args ) {
        Person p=new Person();
        p.setAge ( 10 );
        System.out.println (p.getAge () );

        Person p1=new Person("Tom");
        p1.getName ();
        Person p2 = new Person ( "Too", 2 );
        System.out.println (p2.getAge ()+p2.getName () );

    }
}
class Person{
    private String name;
    private int age;

    public Person ( ){
        System.out.println ("很多行代码，初始化" );
    }
    public Person ( String name){
        this();
        System.out.println ("name构造器" );
        this.name = name;
    }
    public Person ( String name,int age){
        this(name);
        this.age=age;
    }


    public void setName(String name){
        this.name =name;   //this相当于（当前对象）
    }
    public void setAge(int age){
        this.age =age;
    }

    public int getAge ( ) {
        return age;
    }

    public String getName ( ) {
        return name;
    }
}