package bilbil.面向对象.上.二波.this关键字;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/11 21:19
 * @Author: 曹志阳
 * @Classname teeufst
 * @software :IntelliJ IDEA
 */
public class test {
    public static void main ( String[] args ) {
        Boy boy1=new Boy("罗密哦",21);
        boy1.shout ();
        Girl girl1=new Girl ("朱丽叶",19);
        girl1.marry ( boy1 );
        Girl girl2=new Girl ("祝英台",19);
        if(girl2.compare ( girl1 )>0){
            System.out.println (girl2.getName ()+"比"+girl1.getName ()+"大");
        }else if(girl2.compare ( girl1 )<0){
            System.out.println ( girl2.getName ()+"比"+girl1.getName ()+"小");
        }else{
            System.out.println (girl2.getName ()+"和"+girl1.getName ()+"年龄一样" );
        }



    }
}
class Boy{
    private String name;
    private int age;

    public Boy(){

    }
    public Boy(String name,int age){
        this.name = name;
        this.age = age;
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

    public void marry(Girl girl){
        System.out.println ("我想娶"+girl.getName () );
    }
    public void shout(){
        if ( this.age>=22 ){
            System.out.println ("可以结婚" );
            return;
        }
        System.out.println ("年龄不够，不能结婚" );
    }
}
class Girl{
    private String name;
    private int age;

    public Girl(){

    }
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name =name;   //this相当于（当前对象）
    }


    public String getName ( ) {
        return name;
    }

    public void marry(Boy boy){
        System.out.println ("我想嫁给"+boy.getName () );
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     * @param girl
     * @return 正数：当前对象大 负数：当前对象小  0：两个一样大
     */
    public int compare(Girl girl){
        return this.age-girl.age;
    }
}
