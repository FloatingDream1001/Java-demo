package bilbil.面向对象.上.二波.构造器;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/10 15:26
 * @Author: 曹志阳
 * @Classname Test2
 * @software :IntelliJ IDEA
 */
public class Test2 {
    public static void main ( String[] args ) {
        Person1 p1=new Person1();
//        p1.setAge ( 12 );
        System.out.println ("年龄为"+p1.GetAge () );

        Person1 p2=new Person1("Ton",10);
        System.out.println ("name"+p2.GetName()+",age"+p2.GetAge() );
    }
}



class Person1{
    private int age;
    private String name;

    public Person1( ){
        age=18;
    }
    public Person1( String n ,int a){
        age=a;
        name=n;
    }

    public void setAge(int a) {
        if (a<0||a>130){
            System.out.println ("传入数据非法" );
            return;
        }
        age = a;
    }

    public int GetAge(){
        return age;
    }

    public String GetName(){
        return name;
    }
}