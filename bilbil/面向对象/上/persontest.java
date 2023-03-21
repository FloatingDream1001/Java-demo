package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/17 16:27
 * @Author: 曹志阳
 * @Classname persontest
 * @software :IntelliJ IDEA
 */
public class persontest {
    public static void main ( String[] args ) {
        Person s1=new Person();
        s1.name="Tpm";
        s1.age=18;
        s1.sex= 1;
        s1.study ();
        System.out.println (s1.name );
        s1.showAge ();
        int newage=s1.addAge(3);
        System.out.println (newage);
    }
}
