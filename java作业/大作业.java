package java作业;
import java.util.LinkedList;
import java.util.Scanner;
public class 大作业 {
    public static void main ( String[] args ) {
        LinkedList numsno = new LinkedList ( );
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "请输入你的学号后三位" );
        int N = sc.nextInt ( );
        for ( int i = 1 ; i < N ; i++ ) {
            numsno.add ( i );
        }
        int count = 0;
        while (numsno.size ( ) > 1) {
            for ( int i = 0 ; i < numsno.size ( ) ; i++ ) {
                count = count + 1;
                if ( count == 3 ) {
                    numsno.remove ( numsno.get ( i ) );
                    count = 0;
                }
            }
        }
        System.out.println ( "最后留下的是原来编号为" +numsno+"的同学" );
    }
}
