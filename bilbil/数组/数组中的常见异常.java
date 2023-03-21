package bilbil.数组;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/9 15:08
 * @Author: 曹志阳
 * @Classname 数组中的常见异常
 * @software :IntelliJ IDEA
 */
public class 数组中的常见异常 {
    public static void main ( String[] args ) {
        int []arr=new int[]{1,2,3,4,5};
        //1,数组角标越界异常:ArrayIndexOutOfBoundsException

//        for ( int i=0; i<=arr.length; i++ ){
//            System.out.println (arr[i] );
//        }
        //2.
//        System.out.println (arr[10] );
        //空指针异常:NullPointerException
        int[] arr2=new int[]{1,2,3};
        //1.
//        arr2=null;
//        System.out.println ( arr2[1]);
        //2.
//        int[][] arr3=new int[4][];
//        System.out.println (arr3[2][0] );
        //3.
//        String []arr4=new String[]{"1","2","3"};
//        arr4[0]=null;
//        System.out.println (arr4[0].toString ());

    }
}
