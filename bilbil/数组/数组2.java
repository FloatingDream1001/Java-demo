package bilbil.数组;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/17 10:59
 * @Author: 曹志阳
 * @Classname 数组2
 * @software :IntelliJ IDEA
 */
public class 数组2 {
    public static void main ( String[] args ) {
        int [] arr=new int[3];
        arr[0]=50;
        arr[1]=100;
        arr[2]=200;
        System.out.println (arr );
        System.out.println (arr[0] );
        System.out.println (arr[1] );
        System.out.println (arr[2] );
        int [] arr2=arr;
        arr2[0]=111;
        arr2[1]=222;
        arr2[2]=333;
        System.out.println (arr2 );
        System.out.println (arr );
        System.out.println (arr[0] );
        System.out.println (arr2[1] );
        System.out.println (arr2[2] );

    }
}
