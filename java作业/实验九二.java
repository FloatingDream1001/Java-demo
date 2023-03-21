package java作业;
import java.util.*;
/**
 * @ codeing=utf-8
 * @Time : 2022/4/29 9:22
 * @Author: 曹志阳
 * @Classname 实验九二
 * @software :IntelliJ IDEA
 */
public class 实验九二 {
    public static void main ( String[] args ) {
        TreeSet t = new TreeSet ( );//有序按从小到大排序
        Random rm = new Random ( 10 );
        int a = 1;
        while (t.size ( ) < 10) {
            int i = rm.nextInt ( 20 ) + 1;
            t.add ( i );
            System.out.print ( i + " " );
        }
        System.out.println ( );
        System.out.println ( t );
        Iterator it = t.iterator ( );
        while (it.hasNext ( )) {
            System.out.println ( "第" + ( a++ ) + "次输出：" + it.next ( ) + " " );
        }
    }
}
