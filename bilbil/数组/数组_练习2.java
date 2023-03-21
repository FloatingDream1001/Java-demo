package bilbil.数组;

import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/3 21:14
 * @Author: 曹志阳
 * @Classname 二维数组_练习2
 * @software :IntelliJ IDEA
 */
//在10-99之间随机抽十个数进行求最大、最小值、和值、平均值
public class 数组_练习2 {
    public static void main ( String[] args ) {
        int[] arr = new int[ 10 ];
        Random rm = new Random ( );
        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr[ i ] = rm.nextInt ( 90 ) + 10;
            System.out.print ( arr[ i ] + " " );
        }
        System.out.println ( );
        //求和
        float sum = 0;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            sum += arr[ i ];
        }
        //求平均
        float av = sum / arr.length;
        //求最值
        int max = arr[ 0 ];
        int min = arr[ 0 ];

        for ( int i = 1 ; i < arr.length ; i++ ) {
            if ( max < arr[ i ] ) {
                max = arr[ i ];
            }
            if ( min > arr[ i ] ) {
                min = arr[ i ];
            }

        }
        System.out.println ( "数组中最大值:" + max + " 最小值:" + min + " 数组和:" + sum + " 平均:" + av );
    }
}
