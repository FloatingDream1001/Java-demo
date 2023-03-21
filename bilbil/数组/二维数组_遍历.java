package bilbil.数组;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/3 13:41
 * @Author: 曹志阳
 * @Classname 数组2_遍历
 * @software :IntelliJ IDEA
 */
public class 二维数组_遍历 {
    public static void main ( String[] args ) {
        int[][] arr = new int[ 2 ][ 3 ];
        Scanner sc = new Scanner ( System.in );
        for ( int i = 0 ; i < arr.length ; i++ ) {
            for ( int j = 0 ; j < arr[ i ].length ; j++ ) {
                arr[ i ][ j ] = sc.nextInt ( );

            }
        }
        for ( int i = 0 ; i < arr.length ; i++ ) {
            for ( int j = 0 ; j < arr[ i ].length ; j++ ) {
                System.out.print ( arr[ i ][ j ]+" " );
            }
            System.out.println ( );
        }
    }
}
