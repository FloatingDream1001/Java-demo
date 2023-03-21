package bilbil;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/24 11:39
 * @Author: 曹志阳
 * @Classname 不死神兔
 * @software :IntelliJ IDEA
 */
public class 不死神兔 {
    public static void main ( String[] args ) {
        int[] arr = new int[ 20 ];
        arr[ 0 ] = 1;
        arr[ 1 ] = 1;
        for ( int i = 2 ; i < 20 ; i++ ) {
            arr[ i ] = arr[ i - 1 ] + arr[ i - 2 ];
        }
        System.out.println ( "20个月时小兔子有" + arr[ 19 ] + "个" );
    }
}
