package bilbil.面向对象.上.二波;

import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/10/26 15:08
 * @Author: 曹志阳
 * @Classname Student
 * @software :IntelliJ IDEA
 */
public class Student {
    public static void main ( String[] args ) {
        //声明一个Student数组
        StudentDemo[] stus =new StudentDemo[20];
        Student st = new Student();
        Random rm = new Random(0);
        for(int i=0; i<stus.length; i++){
            stus[i] = new StudentDemo();
            //赋值 给每一个对象
            stus[i].number=i+1;
            stus[i].state=rm.nextInt(6)+1;
            //成绩
            stus[ i ].score = rm.nextInt ( 101 );
        }
        st.print ( stus );
        System.out.println ("**************************" );

        //遍历年级3
        st.searchState ( stus,3 );
        System.out.println ("**************************" );
        //冒泡排序
        st.sortmax ( stus );
        st.print ( stus );

    }
    public void sortmax(StudentDemo[] stus){
        for ( int i=0; i<stus.length-1; i++){
            for ( int j=0;j<stus.length-1-i;j++ ){
                if ( stus[j].score<stus[j+1].score ){
                    StudentDemo tmp = stus[ j ];
                    stus[ j ] = stus[ j + 1 ];
                    stus[j+1]=tmp;
                }
            }
        }
    }

    public void print(StudentDemo[] stus){
        for ( int i=0; i<stus.length; i++){
            System.out.println (stus[i].info () );

        }
    }
    public void searchState(StudentDemo[] stus,int state){
        for ( int i=0; i<stus.length; i++){
            if(stus[i].state==state){
                System.out.println (stus[i].info () );
            }
        }
    }

}

class StudentDemo{
    int number;//学号
    int state;//年纪
    int score;//成绩
    public String info () {
        return "学号" + number + " 年级" + state+ " 成绩" + score;
    }
}