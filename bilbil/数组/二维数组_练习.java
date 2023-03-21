package bilbil.数组;

import java.util.Arrays;
import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/3 17:37
 * @Author: 曹志阳
 * @Classname 二维数组_练习
 * @software :IntelliJ IDEA
 */
//随机出来六个数不能重复
public class 二维数组_练习 {
    public static void main ( String[] args ) {
        Random rm = new Random ( );
        int[] arr = new int[ 6 ];
        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr[ i ] = rm.nextInt ( 30 ) + 1;
            if ( i > 0 ) {
                for ( int j = 0 ; j < i ; j++ ) {
                    if ( arr[ i ] == arr[ j ] ) {
                        i -= 1;
                        continue;
                    }
                }
            }
        }
        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.print ( arr[ i ] + " " );
        }
//        System.out.println ( Arrays.toString (arr));//一维数组可以使用
    }
}
