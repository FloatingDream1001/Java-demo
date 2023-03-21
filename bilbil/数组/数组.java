package bilbil.数组;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/14 19:55
 * @Author: 曹志阳
 * @Classname 数组
 * @software :IntelliJ IDEA
 */
public class 数组 {
    public static void main ( String[] args ) {
        int[] arr=new int[3];
        /*左边：
        int ：说明数组中的元素类型是int类型
        []:说明这是一个数组
        arr:这是数组名称
        右边：
        new: 为数组申请内存空间
        3：数组长度，其实指的是数组中的元素个数  */

        //输出数组名
        System.out.println ( arr );

        //输出数组中的元素
        System.out.println ( arr[0] );
        System.out.println ( arr[1] );
        System.out.println ( arr[2] );

    }
}
