package bilbil.数组;

import java.util.Arrays;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/9 14:30
 * @Author: 曹志阳
 * @Classname arraystest
 * @software :IntelliJ IDEA
 */
//arrays是操作数组工具类，里面定义了很多操作数组的方法
public class 数组_arraystest {
    public static void main ( String[] args ) {
        //数组之间比较
        int [] arr1=new int[]{1,2,3,4,5};
        int [] arr2=new int[]{1,3,2,4,5};
        boolean isEquals= Arrays.equals( arr1, arr2);
        System.out.println (isEquals );
        //输出数组信息
        System.out.println (Arrays.toString ( arr1 ) );
        //将指定的值全部替换原来填充数组中
        Arrays.fill ( arr1, 10 );
        System.out.println (Arrays.toString ( arr1 ));
        //对数组排序
        Arrays.sort ( arr2 );
        System.out.println (Arrays.toString ( arr2));
        //数组查找,负数，表示数组里没有
        int []arr3=new int[]{1,22,53,89,91,256,12};
        int index=Arrays.binarySearch ( arr3,210 );
        System.out.println (index );

    }
}
