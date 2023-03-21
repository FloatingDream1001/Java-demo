package java作业;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/11 8:27
 * @Author: 曹志阳
 * @Classname 实验二
 * @software :IntelliJ IDEA
 */
public
class 实验二 {
    public static void main ( String[] args ) {
        int sum = 0;
        for ( int i = 1 ; i <= 10 ; i++ ) {
            int n = 1;
            for ( int j = 1 ; j <= i ; j++ )
                n *= j;
            sum += n;
        }
        System.out.println ( "一到十的阶乘和为" + sum );

    }
}
