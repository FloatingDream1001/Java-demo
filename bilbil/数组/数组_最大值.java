package bilbil.数组;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/24 10:38
 * @Author: 曹志阳
 * @Classname 数组_最大值
 * @software :IntelliJ IDEA
 */
public class 数组_最大值 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.print ( "输入数组长度" );
        int N = sc.nextInt ( );
        int[] arr = new int[ N ];
        for ( int i = 0 ; i < N ; i++ ) {
            System.out.print ( "输入第" + ( i + 1 ) + "个元素" );
            arr[ i ] = sc.nextInt ( );
        }
        int max = max ( arr );
        System.out.println ( "最大值为" + max );
    }

    public static int max ( int arr[] ) {
        int max = arr[ 0 ];
        for ( int i = 1 ; i < arr.length ; i++ ) {
            if ( max < arr[ i ] ) {
                max = arr[ i ];
            }
        }
        return max;
    }
}
