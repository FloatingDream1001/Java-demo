package java作业;
import java.util.Scanner;
/**
 * @ codeing=utf-8
 * @Time : 2022/3/18 9:00
 * @Author: 曹志阳
 * @Classname 实验三
 * @software :IntelliJ IDEA
 */
public class 实验三 {
    public static void main ( String[] args ) {
        long start = System.currentTimeMillis ( );
        Scanner sc = new Scanner ( System.in );
        System.out.println ("要输入几个数" );
        int N=sc.nextInt ();
        int[] arr = new int[ N ];
        System.out.println ( "请依次输入"+N+"个数" );
        for ( int i = 0 ; i < arr.length; i++ ) {
            int b = sc.nextInt ( );
            arr[ i ] = b;
        }
        for ( int j = 1 ; j < arr.length  ; j++ ) {
            System.out.print ( "第" + j  + "轮" );
            for ( int i = 0 ; i < arr.length - 1 ; i++ ) {
                if ( arr[ i ] > arr[ i + 1 ] ) {
                    int min = arr[ i ];
                    arr[ i ]     = arr[ i + 1 ];
                    arr[ i + 1 ] = min;
                }
            }
            for ( int i = 0 ; i < arr.length  ; i++ ) {
                System.out.print ( arr[ i ] + " " );
            }
            System.out.println ( );
        }
        long end = System.currentTimeMillis ( );
        System.out.println ( "共耗时" + ( end - start ) + "毫秒" );
    }
}
