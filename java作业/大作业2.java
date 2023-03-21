package java作业;
import java.util.LinkedList;
import java.util.Random;
/**
 * @ codeing=utf-8
 * @Time : 2022/4/25 20:21
 * @Author: 曹志阳
 * @Classname 大作业2
 * @software :IntelliJ IDEA
 */
public class 大作业2 {
    public static void main ( String[] args ) {
        LinkedList x = new LinkedList ( );
        Random rm = new Random (  );
        //白球为0，黑球为1
        for ( int i = 0 ; i < 29 ; i++ ) {
            x.add ( 0 );
        }
        for ( int i = 0 ; i < 21 ; i++ ) {
            x.add ( 1 );
        }
        for ( int i = 0 ; i < 48 ; i++ ) {
            int r1 = rm.nextInt ( x.size ( ) );
            int t1 = (int) x.get ( r1 );
            x.remove ( r1 );
            int r2 = rm.nextInt ( x.size ( ) );
            int t2 = (int) x.get ( r2 );
            x.remove ( r2 );
            if ( t1 == t2 ) {
                x.add ( 1 );
            }
            if ( t1 != t2 ) {
                x.add ( 0 );
            }
        }
        int count = 0, count1 = 0;
        for ( int i = 0 ; i < x.size ( ) ; i++ ) {
            int num2 = (int) x.get ( i );
            if ( num2 == 0 ) {
                count = count + 1;
            }
            else {
                count1 = count1 + 1;
            }
        }
        System.out.println ( "白球" + count + "个，黑球" + count1 + "个" );
    }
}
