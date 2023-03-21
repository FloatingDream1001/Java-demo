package bilbil;

import java.util.Arrays;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/9 16:47
 * @Author: 曹志阳
 * @Classname 冒泡
 * @software :IntelliJ IDEA
 */
public class 冒泡 {
    public static void main ( String[] args ) {
        int[]arr =new int[]{34,5,22,-98};
        for( int i=0; i<arr.length-1; i++ ){
            System.out.println ("第"+(i+1)+"轮");
            for( int j=0; j<arr.length-1-i; j++ ){
                if( arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            System.out.println (Arrays.toString(arr) );
        }
//        System.out.println ( Arrays.toString( arr));
    }

}
