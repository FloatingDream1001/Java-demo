package java作业;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/25 9:18
 * @Author: 曹志阳
 * @Classname 实验四_1
 * @software :IntelliJ IDEA
 */
public class 实验四_1 {
    public static void main ( String[] args ) {
        Student p1=new Student ( );
        p1.read ();
        System.out.println ( );
        Student p2=new Student ( "张三" );
        p2.read ();
        System.out.println ( ); 
        Student p3=new Student ( "张三", (short) 19 );
        p3.read ();
        System.out.println ( );
        Student p4=new Student ( "张三", (short) 19, "大数据" );
        p4.read ();
    }
}
