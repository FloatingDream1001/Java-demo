package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/28 15:57
 * @Author: 曹志阳
 * @Classname 标准类制作
 * @software :IntelliJ IDEA
 */
public class 标准类制作 {
    public static void main ( String[] args ) {
      Student2 p1=new Student2 ( "张三",19 );
      p1.Setzhuanye ( "大数据" );
        System.out.print (p1.Getzhuanye () );
        p1.show ();
    }
}
 class Student2{
    private String name;
    private int age;
    private String zhuanye;


    public Student2(){

    }
     public Student2(String name,int age){
        this.age=age;
        this.name=name;

     }
     public void Setzhuanye(String zhuanye){
        this.zhuanye=zhuanye;

     }
     public String Getzhuanye(){
        return zhuanye;
     }
     public void show(){
         System.out.println (name+","+age );
     }
}
