package bilbil;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/6 15:42
 * @Author: 曹志阳
 * @Classname if多重
 * @software :IntelliJ IDEA
 */
public class if多重 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.print ( "请输入小明的分数（0-100）：" );
        float a = sc.nextFloat ( );
        if ( a >= 95 && a <= 100 ) {
            System.out.println ( "奖励一辆自行车" );
        } else if (( a <= 94)&&(a >= 90   )) {
            System.out.println ( "去游乐园" );
        } else if ( a >= 80 && a <= 89 ) {
            System.out.println ( "买玩具" );
        } else
            System.out.println ( "被揍一顿" );

    }
}

