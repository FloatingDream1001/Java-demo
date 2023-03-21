package bilbil.面向对象.上;

import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/17 16:54
 * @Author: 曹志阳
 * @Classname Student1
 * @software :IntelliJ IDEA
 */
public class Student1test {
    public static void main ( String[] args ) {
        //声明一个student数组
        Student1[] stus = new Student1[ 20 ];
        Random rm = new Random ( 20 );
        for ( int i = 0 ; i < stus.length ; i++ ) {
            //给元素赋值
            stus[ i ] = new Student1 ( );
            //给student对象的属性赋值
            stus[ i ].number = ( i + 1 );
            stus[ i ].start  = rm.nextInt ( 6 ) + 1;
            stus[ i ].score  = rm.nextInt ( 100 ) + 1;
        }
        print ( stus );
        System.out.println ( "**********成绩排序************" );
        score ( stus );
        print ( stus );
        System.out.println ( "年纪筛选" );
        state ( stus, 3 );

    }

    public static void print ( Student1[] stus ) {
        for ( int i = 0 ; i < stus.length ; i++ ) {
            System.out.println ( stus[ i ].info ( ) );
        }
    }
    public static void score ( Student1[] stus ) {
        //使用冒泡排序将学生成绩按从小到大拍
        for ( int i = 0 ; i < stus.length - 1 ; i++ ) {
            for ( int j = 0 ; j < stus.length - 1 - i ; j++ ) {
                if ( stus[ j ].score < stus[ j + 1 ].score ) {
                    //交换的是数组对象；
                    Student1 tump = stus[ j ];
                    stus[ j ]     = stus[ j + 1 ];
                    stus[ j + 1 ] = tump;
                }
            }
        }
    }
    public static void state ( Student1[] stus, int state ) {
        for ( int i = 0 ; i < stus.length ; i++ ) {
            if ( stus[ i ].start == state ) {
                System.out.println ( stus[ i ].info ( ) );
            }
        }
    }
}

class Student1 {
    int number;//学号
    int start;//年纪
    int score;//成绩
    public String info () {
        return "学号" + number + " 年纪" + start + " 成绩" + score;
    }
}
