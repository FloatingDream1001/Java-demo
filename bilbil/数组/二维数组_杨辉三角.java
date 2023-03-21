package bilbil.数组;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/3 17:03
 * @Author: 曹志阳
 * @Classname 二维数组_杨辉三角
 * @software :IntelliJ IDEA
 */
public class 二维数组_杨辉三角 {
    public static void main ( String[] args ) {
        int[][] yanghui =new int[10][];
        for (int i=0; i<10;i++){
            yanghui[i]=new int[i+1];
            yanghui[i][0]=yanghui[i][i]=1;
            if ( i>1){
                for(int j=1; j<yanghui[i].length-1; j++){
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            }
        }
        for (int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print (String.format ( "%3d",yanghui[i][j])+" ");
            }
            System.out.println ( );
        }


    }


}

