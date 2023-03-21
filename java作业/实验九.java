package java作业;

import java.util.*;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/29 9:05
 * @Author: 曹志阳
 * @Classname 实验九
 * @software :IntelliJ IDEA
 */
public class 实验九 {
    public static void main ( String[] args ) {
        HashSet h = new HashSet ( );
        Random rm = new Random ( 10 );
        System.out.println ( "总共随机出来的数为" );
        while (h.size ( ) < 7) {
            int i = rm.nextInt ( 31 ) + 1;
            h.add ( i );
            System.out.print ( i + " " );
        }
        System.out.println ( );
        System.out.println ( "无序后set表里的值为" );
        Iterator n = h.iterator ( );//迭代器
        int i = 1;
        while (n.hasNext ( )) {
            System.out.println ( "第" + ( i++ ) + "次输出：" + n.next ( ) );
        }
        System.out.println ( );
        int j = 1;
        for ( Object o : h ) {//foreach
            System.out.println ( "第" + ( j++ ) + "次输出：" + o );
        }
    }
}
