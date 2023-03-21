package bilbil.数组;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 11:11
 * @Author: 曹志阳
 * @Classname 反转
 * @software :IntelliJ IDEA
 */
public class 数组反转 {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner ( System.in );
        System.out.print ("输入数组长度" );
        int N=sc.nextInt ();
        int []arr=new int[N];
        System.out.println ("依次输入数组" );
        for(int i=0;i<arr.length;i++){
            arr [i]=sc.nextInt ();
        }
        fanzhuan ( arr );

    }
    public static void fanzhuan(int []arr){
        int a;
        for(int i=0;i<arr.length/2;i++){
            a=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=a;
        }
        for ( int i=0;i<arr.length;i++ ){
            System.out.print (arr[i]+" " );
        }
    }
}
