package bilbil.方法;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/21 20:01
 * @Author: 曹志阳
 * @Classname 方法_重载
 * @software :IntelliJ IDEA
 */
public class 方法_重载 {
    public static void main ( String[] args ) {
        double a = sum ( 12.5,16.7 );
        int b=sum (12,10,80  );
        System.out.println (a );
        System.out.println (b );
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    }

