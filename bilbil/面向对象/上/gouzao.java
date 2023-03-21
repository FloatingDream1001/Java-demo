package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/28 15:36
 * @Author: 曹志阳
 * @Classname gouzao
 * @software :IntelliJ IDEA
 */
public class gouzao {
    private String name;
    private int age;
    private String zhuanye;


    public gouzao(){
        System.out.println ("这是构造函数" );
    }
    public void Getname( String name){
        this.name=name;

    }
    public String Setname(){
        return name;
    }


    public void show(){
        System.out.println (name+","+age+","+zhuanye );
    }

}
