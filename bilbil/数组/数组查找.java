package bilbil.数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 10:48
 * @Author: 曹志阳
 * @Classname 数组查找
 * @software :IntelliJ IDEA
 */
public class 数组查找 {
    public static void main ( String[] args ) {
        int[] arr = {11, 33,22 , 44, 55};
        String[] arr1 = {"jj", "22", "33", "44", "55"};
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "输入第一个查找的数" );
        int number = sc.nextInt ( );
        System.out.println ( "输入第二个查找的数" );
        String numberStr = sc.next ();
        int suoyin = find ( arr, number );
        find1 ( arr1,numberStr );
        System.out.println ( number+"arr[" + suoyin + "]" );
        find2 ( arr, number );
    }

    //线性查找
    public static int find ( int[] arr, int a ) {
        int redix = -1;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( arr[ i ] == a ) {
                redix = i;
                break;
            }
        }
        return redix;
    }

    //线性查找
    public static boolean find1 ( String[] arr1, String numberStr ) {
        boolean isFlag = false;
        for ( int i = 0 ; i < arr1.length ; i++ ) {
            if ( numberStr.equals ( arr1[ i ] ) ) {//字符内容比较equals
                System.out.println ( numberStr+"找到指定元素位置，位置为arr[" + i + "]" );
                isFlag = true;
                break;
            }
        }
        if ( isFlag==false ) {
            System.out.println ("没有查找到" );
        }
        return isFlag;
    }
    //二分法查找:必须有序
    public static boolean find2 ( int[] arr, int a){
        Arrays.sort ( arr );
        boolean isFlag = false;
        int head=0;
        int end=arr.length-1;
        while(head<=end){
            int mdile=(head+end)/2;
            if ( a==arr[mdile] ){
                System.out.println ("arr数组里有"+a );
                isFlag=true;
                break;
            }
            else if(a<arr[mdile]){
                end=mdile-1;
            }
            else{
                head=mdile+1;
            }
        }
        return isFlag;
    }
}
