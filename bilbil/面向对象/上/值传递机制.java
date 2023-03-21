package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/5/23 15:08
 * @Author: 曹志阳
 * @Classname 值传递机制
 * @software :IntelliJ IDEA
 */
/*
 *方法的形参的传递机制：值传递
 * 1.形参：定义方法时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 *
 * 两个方法是静态，相互调用需要引用类创建对象；若两个都不是static则不需要创建对象。
 *
 * 2.值传递机制：
 * 如果参数是基本数据类型，此时实参赋给形参的是真实存储的数据值；
 * 如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 *
 */
public class 值传递机制 {
    public static void main ( String[] args ) {
        int i=10,j=20;
        DaTa data=new DaTa();
        data.i=10;
        data.j=20;
        System.out.println (i+" "+j );
        值传递机制 a=new 值传递机制 ();
        a.swap ( i,j );
        System.out.println ("1 "+i+" "+j );
        a.swap ( data  );
        System.out.println ("2 "+data.i+" "+data.j );

    }
        public static void swap( int m, int n ) {
            int temp= m;
            m = n;
            n = temp;
            System.out.println ( "i=" + m + "j=" + n );

        }
        public void swap(DaTa data){
            int temp= data.i;
            data.i = data.j;
            data.j = temp;
        }
}
class DaTa{
    int i,j;


}
