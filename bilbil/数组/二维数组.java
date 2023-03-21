package bilbil.数组;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/29 20:50
 * @Author: 曹志阳
 * @Classname 二维数组
 * @software :IntelliJ IDEA
 */
public class 二维数组 {
    public static void main ( String[] args ) {
        int [][] arr=new int[][]{{1,2,3},{4,5,6}};
        int [][] arr1=new int[3][2];
        int [][] arr3=new int[5][];//若直接调用第二维度数值报错需要
        arr3[1]=new int[2];
         //这样才能正确调动第二维度
        System.out.println (arr3[1][1] );
        System.out.println (arr[1][2] );
        System.out.println (arr1[2][1] );
//        System.out.println ( Arrays.binarySearch ( ) );
    }
}
