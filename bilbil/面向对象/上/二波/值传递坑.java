package bilbil.面向对象.上.二波;

import java.util.Arrays;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/1 17:24
 * @Author: 曹志阳
 * @Classname 值传递坑
 * @software :IntelliJ IDEA
 */
public class 值传递坑 {
    public static void main ( String[] args ) {
        int []arr=new int []{12,3,34,56,77,432};
        值传递坑 s=new 值传递坑();
//        s.swap ( arr );
        s.swap1 ( arr );
        System.out.println ( Arrays.toString ( arr ) );

    }
    //错误写法：
    public void swap ( int[]arr){
        for(int i=0; i<arr.length; i++){
            arr[i]=arr[i]/arr[0];
        }
    }

    //正确写法：
    public void swap1 ( int[] arr ) {
        for(int i=arr.length-1; i>=0; i--){
            arr[ i ] = arr[ i ] / arr[ 0 ];
        }
    }
}
