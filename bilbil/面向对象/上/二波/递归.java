package bilbil.面向对象.上.二波;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/1 21:39
 * @Author: 曹志阳
 * @Classname 递归
 * @software :IntelliJ IDEA
 */
//自己调自己

public class 递归 {
    public static void main ( String[] args ) {
        int i = sum ( 100 );
        System.out.println (i );
        int n = Function ( 10 );
        System.out.println (n );
        int x=Function(10);
        System.out.println (x );

    }
    //计算1-n和
    public static  int sum ( int n ) {
        if ( n == 1 ) {
            return 1;
        }
        else{
            return n+sum ( n-1 );
        }
    }
    //计算阶乘
    public static int Cheng ( int n ) {
        if ( n == 1 ) {
            return 1;
        }
        else{
            return n * Cheng ( n - 1 );
        }
    }
    //f(n+2)=2*f(n+1)+f(n)
    public static int Function(int n){
        if ( n == 0 ) {
            return 1;
        }else if(n==1){
            return 4;
        }
        else{
            return 2 * Function ( n - 1 ) + Function ( n - 2);
        }
    }

    //斐波那契数列
    public static int FeiboFun(int n){
        if ( n == 1 ) {
            return 1;
        }else if ( n == 2) {
            return 1;
        }
        else{
            return FeiboFun ( n - 1 ) + FeiboFun ( n - 2 );
        }
    }

}
