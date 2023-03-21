package bilbil.方法;
import java.util.Scanner;
/**
 * @ codeing=utf-8
 * @Time : 2022/3/19 9:45
 * @Author: 曹志阳
 * @Classname 方法_两数比较大小
 * @software :IntelliJ IDEA
 */
public class 方法_两数比较大小 {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("输入第一个比较大小的数" );
        int a=sc.nextInt (  );
        System.out.println ("输入第二个比较大小的数" );
        int b=sc.nextInt ();
        max ( a,b );

    }
    public static void max(int x,int y){
        int z=x>y?x:y;
        System.out.println ( "最大值为"+z );

    }
}
