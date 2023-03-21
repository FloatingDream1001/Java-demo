package java作业;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/15 8:29
 * @Author: 曹志阳
 * @Classname 实验七
 * @software :IntelliJ IDEA
 */
public class 实验七 {
    public static void main ( String[] args ) {
        int a = 0;
        System.out.println ( "求1的绝对值" + Math.abs ( 1 ) );
        System.out.println ( "求4的平方根" + Math.sqrt ( 4 ) );
        System.out.println ( "向上取整" + Math.ceil ( 1.3 ) );
        System.out.println ( "向下取整" + Math.floor ( 1.3 ) );
        System.out.println ( "四舍五入" + Math.round ( 1.3 ) );
        System.out.println ( "求两数之间最大值" + Math.max ( 3, 4 ) );
        System.out.println ( "求两数之间最小值" + Math.min ( 3, 4 ) );
        for ( int i = 0 ; i < 10 ; i++ ) {
            a = Math.max ( i, 8 );

        }
        System.out.println ( a );
        System.out.println ( "求3的4次方" + Math.pow ( 3, 4 ) );

    }
}
