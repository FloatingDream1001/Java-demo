package bilbil.debug;


import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/24 11:05
 * @Author: 曹志阳
 * @Classname 求偶数和
 * @software :IntelliJ IDEA
 */
public class 求偶数和 {
    public static void main ( String[] args ) {
        int sum=0;
        Scanner sc=new Scanner ( System.in);
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println ("偶数和为"+sum );
    }
}
