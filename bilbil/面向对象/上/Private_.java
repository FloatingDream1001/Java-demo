package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/27 16:42
 * @Author: 曹志阳
 * @Classname private_
 * @software :IntelliJ IDEA
 */
public class Private_ {
//    成员变量
    String name;
    private int age;

//    提供get/set方法

    public void setAge ( int a ) {
        if(a<0||a>120){
            System.out.println ("你给的年龄有误" );
        }
        else {
            age=a;
        }
    }

    public int getAge () {
        return age;
    }
//    成员方法
    public void show(){
        System.out.println (name+","+age );
    }
}

