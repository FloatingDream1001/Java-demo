package bilbil;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/5 15:49
 * @Author: 曹志阳
 * @Classname 三个和尚
 * @software :IntelliJ IDEA
 */
public class 三个和尚 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "请输入第一个身高（cm）" );
        float a = sc.nextFloat ( );
        System.out.println ( "请输入第二个身高(cm)" );
        float b = sc.nextFloat ( );
        System.out.println ( "请输入第三个身高（cm）" );
        float c = sc.nextFloat ( );
        float t = a > b ? a : b;
        t = t > c ? t : c;
        System.out.println ( "三个人中最高的是"+t+"（cm）" );


    }

}
