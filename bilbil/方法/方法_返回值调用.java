package bilbil.方法;
import java.util.Scanner;
/**
 * @ codeing=utf-8
 * @Time : 2022/3/21 19:23
 * @Author: 曹志阳
 * @Classname 方法_返回值调用
 * @software :IntelliJ IDEA
 */
public class 方法_返回值调用 {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("请输入要判断奇偶的数" );
        int number=sc.nextInt ();
        boolean flag=zhenjia ( number);
        System.out.println (flag );

    }
    public static boolean zhenjia(int number){
        if(number%2==0){
            return true;
        }else
            return false;
    }
}
