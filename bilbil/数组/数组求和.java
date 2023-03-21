package bilbil.数组;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 10:14
 * @Author: 曹志阳
 * @Classname 数组求和
 * @software :IntelliJ IDEA
 */
public class 数组求和 {
    public static void main ( String[] args ) {
        int [] arr={68,27,95,88,997,238};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10!=7&&arr[i]/10%10!=7&&arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println ("和为"+sum );
    }
}
