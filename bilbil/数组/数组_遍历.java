package bilbil.数组;

import java.util.Arrays;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/17 11:18
 * @Author: 曹志阳
 * @Classname 数组_遍历
 * @software :IntelliJ IDEA
 */
public class 数组_遍历 {
    public static void main ( String[] args ) {
        int []arr={1,2,34,5,6,7,8};
        System.out.println (Arrays.binarySearch ( arr,3 ) );
        System.out.println ( Arrays.toString ( arr ) );
        for (int i=0;i<arr.length;i++){
            System.out.print (arr[i]+" " );
        }
    }
}
