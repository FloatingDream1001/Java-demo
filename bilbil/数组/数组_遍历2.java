package bilbil.数组;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/24 10:24
 * @Author: 曹志阳
 * @Classname 数组_遍历2
 * @software :IntelliJ IDEA
 */
public class 数组_遍历2 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "输入数组长度" );
        int N = sc.nextInt ( );
        int[] arr = new int[ N ];
        System.out.println ( "依次输入数组" );
        for ( int i = 0 ; i < N ; i++ )
              arr[ i ] = sc.nextInt ( );
        bianli ( arr );

    }

    public static void bianli ( int arr[] ) {
        System.out.print ( "[" );
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( i == arr.length - 1 ) {
                System.out.print ( arr[ i ] );

            }
            else {
                System.out.print ( arr[ i ] + ", " );
            }
        }
        System.out.println ( "]" );

    }
}
