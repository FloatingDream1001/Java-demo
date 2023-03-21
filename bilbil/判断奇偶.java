package bilbil;
import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/6 14:56
 * @Author: 曹志阳
 * @Classname 判断奇偶
 * @software :IntelliJ IDEA
 */
public class 判断奇偶 {
    public static void main(String [] args ){
        Scanner sc=new Scanner ( System.in );
        System.out.print ( "请输入要判断的数：" );
        int a=sc.nextInt ();
        if (a%2==0)
            System.out.println ( a+"是偶数" );
        else
            System.out.println ( a+"是奇数" );

    }
}
