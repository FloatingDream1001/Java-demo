package bilbil.方法;
import java.util.Scanner;
/**
 * @ codeing=utf-8
 * @Time : 2022/3/21 19:35
 * @Author: 曹志阳
 * @Classname 方法_比较大小
 * @software :IntelliJ IDEA
 */
public class 方法_比较大小 {
    public static void main ( String[] args ) {
       Scanner sc=new Scanner ( System.in );
       int [] a=new int[2];
       for(int i=0;i<2;i++){
           System.out.println ("请输入第"+(i+1)+"个数" );
           a[i]=sc.nextInt ();
       }
       int maxnum=max ( a[0],a[1] );
        System.out.println ("最大值为"+maxnum );
        System.out.println ("最大值为"+max ( a[0],a[1] ));

    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }else
            return b;
    }
}
