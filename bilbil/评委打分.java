package bilbil;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 14:34
 * @Author: 曹志阳
 * @Classname 评委打分
 * @software :IntelliJ IDEA
 */
public class 评委打分 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "请输入评委位数" );
        int N = sc.nextInt ( );
        Double[] arr = new Double[ N ];
        System.out.println ( "依次输入评委打分" );
        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr[ i ] = sc.nextDouble ( );
        }
        double flag = jieguo ( arr );
//        String.format ( "%.1f",flag );//强转小数位数

        System.out.println ( "最终的平均分为" + flag );
    }

    public static Double jieguo ( Double arr[] ) {
        double sum = 0;
        double max = arr[ 0 ];
        double min = arr[ 0 ];
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( max < arr[ i ] ) {
                max = arr[ i ];
            }
            if ( min > arr[ i ] ) {
                min = arr[ i ];
            }
            sum += arr[ i ];
        }
        sum = sum - min - max;
        double avery = sum / ( arr.length - 2 );
        return avery;

    }
}
