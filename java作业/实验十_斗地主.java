package java作业;
/**
 * @ codeing=utf-8
 * @Time : 2022/5/6 9:08
 * @Author: 曹志阳
 * @Classname 实验十_斗地主
 * @software :IntelliJ IDEA
 */
import java.util.*;
/**
 * 总共有54张牌，发给三个人，留3张底牌，最后地主将底牌收下
 */
public class 实验十_斗地主 {
    public static void main ( String[] args ) {
        LinkedList all = new LinkedList ( );
        String[] num = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] huase = new String[]{"♠", "♥", "♦", "♣"};
        for ( int i = 0 ; i < num.length ; i++ ) {
            for ( int j = 0 ; j < huase.length ; j++ ) {
                all.add ( num[ i ] + huase[ j ] );
            }
        }
        all.add ( "大王" );
        all.add ( "小王" );
        TreeSet wanjia1 = new TreeSet ( );
        TreeSet wanjia2 = new TreeSet ( );
        TreeSet wanjia3 = new TreeSet ( );
        Random rm = new Random ( 55 );
        for ( int i = 0 ; i < 17 ; i++ ) {
            int x = rm.nextInt ( all.size ( ) );
            wanjia1.add ( all.get ( x ) );
            all.remove ( all.get ( x ) );
            int y = rm.nextInt ( all.size ( ) );
            wanjia2.add ( all.get ( y ) );
            all.remove ( all.get ( y ) );
            int z = rm.nextInt ( all.size ( ) );
            wanjia3.add ( all.get ( z ) );
            all.remove ( all.get ( z ) );
        }
        //选地主
        int x = rm.nextInt ( 3 );
        TreeSet dizhu;
        TreeSet nongmin1;
        TreeSet nongmin2;
        if ( x == 0 ) {
            dizhu = wanjia1;
            wanjia1.addAll ( all );
            nongmin1 = wanjia2;
            nongmin2 = wanjia3;
        }
        else if ( x == 1 ) {
            dizhu = wanjia2;
            wanjia2.addAll ( all );
            nongmin1 = wanjia1;
            nongmin2 = wanjia3;
        }
        else {
            dizhu = wanjia3;
            wanjia3.addAll ( all );
            nongmin1 = wanjia1;
            nongmin2 = wanjia2;
        }
        System.out.println ( "地主的牌" + dizhu );
        System.out.println ( "农民1的牌" + nongmin1 );
        System.out.println ( "农民2的牌" + nongmin2 );
    }
}
