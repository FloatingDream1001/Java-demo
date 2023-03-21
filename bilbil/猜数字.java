package bilbil;

import java.util.Random;
import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/13 20:55
 * @Author: 曹志阳
 * @Classname 猜数字
 * @software :IntelliJ IDEA
 */
public class 猜数字 {
    public static void main ( String[] args ) {
        Random num = new Random ( );
        Scanner n = new Scanner ( System.in );
        int num1, n1, count = 0;
        num1 = num.nextInt ( 99 ) + 1;
        for ( ; ; ) {
            count += 1;
            System.out.println ( "输入你要猜的数字" );
            n1 = n.nextInt ( );
            if ( n1 < num1 ) {
                System.out.println ( n1 + "猜小了" );
            } else if ( n1 > num1 ) {
                System.out.println ( n1 + "猜大了" );
            } else {
                System.out.println ( "恭喜你才对了" );
                break;
            }

        }
        System.out.println ( "随机数为" + num1 + "猜了" + count + "次" );

    }
}

