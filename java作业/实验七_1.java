package java作业;

import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/15 8:53
 * @Author: 曹志阳
 * @Classname 实验七_1
 * @software :IntelliJ IDEA
 */
public class 实验七_1 {
    public static void main ( String[] args ) {
        Random rm = new Random ( );
        for ( int i = 0 ; i < 10 ; i++ ) {//在0-10的范围内得到10个随机数
            System.out.print ( rm.nextInt ( 10 ) + " " );
        }
        System.out.println ( );
        for ( int i = 0 ; i < 10 ; i++ ) {//在5-10的范围内得到10个随机数
            System.out.print ( rm.nextInt ( 5 ) + 5 + " " );
        }
        System.out.println ( );
        //在0-10的范围内得到10个随机数，生成后不会再变
        Random rm1 = new Random ( 100 );
        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.print ( rm1.nextInt ( 10 ) + " " );
        }



    }
}
