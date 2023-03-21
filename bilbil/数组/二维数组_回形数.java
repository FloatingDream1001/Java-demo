package bilbil.数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/3 17:59
 * @Author: 曹志阳
 * @Classname 二维数组_回形数
 * @software :IntelliJ IDEA
 */
public class 二维数组_回形数 {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("请输入回形数的列数" );
        int N=sc.nextInt();
        int count =1;
        int [][]arr =new int[N][N];
        int MInX =0;
        int MInY=0;
        int MaxX=N-1;
        int MaxY=N-1;
        while (MaxX>=MInX){
            for ( int i=MInX; i<=MaxY; i++ ){
                arr[MInX][i]=count++;
            }
            MInX+=1;
            for(int j=MInX;j<=MaxX;j++){
                arr[j][MaxX]=count++;
            }MaxX-=1;
            for(int i=MaxX;i>=MInY;i--){
                arr[MaxY][i]=count++;
            }MaxY-=1;
            for(int j=MaxY;j>=MInX;j--){
                arr[j][MInY]=count++;
            }MInY+=1;
        }




        for(int i=0;i<arr.length;i++){
            for( int j=0;j<arr[i].length;j++ ){
                System.out.print (String.format ( "%2d",arr[i][j])+" ");
            }
            System.out.println ( );
        }
//        System.out.println ( Arrays.toString (arr));
    }

}
