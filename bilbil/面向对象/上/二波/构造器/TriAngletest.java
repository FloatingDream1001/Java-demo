package bilbil.面向对象.上.二波.构造器;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/10 15:41
 * @Author: 曹志阳
 * @Classname TriAngletest
 * @software :IntelliJ IDEA
 */
public class TriAngletest {
    public static void main ( String[] args ) {
        TriAngle t = new TriAngle ( );
        t.SetBase ( 2.3 );
        t.SetHeight ( 2.5 );
        System.out.println ( "base:" + t.GetBase ( ) + " height:" + t.GetHeight ( ) );

        TriAngle t2 = new TriAngle ( 2.1, 2.2 );
        System.out.println ( "base:" + t2.GetBase ( ) + " height:" + t2.GetHeight ( ) );

    }
}
