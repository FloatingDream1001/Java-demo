package bilbil;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/12 19:32
 * @Author: 曹志阳
 * @Classname 水仙花数
 * @software :IntelliJ IDEA
 */
public class 水仙花数 {
    public static void main ( String[] args ) {
        int count = 0, ge, shi, bai;
        System.out.println ( "水仙花数有" );
        count = getCount ( count );
        System.out.println ( "" );
        System.out.println ( "1000以内有" + count + "个水仙花数" );

    }

    private static int getCount ( int count ) {
        int ge;
        int shi;
        int bai;
        for ( int i = 100 ; i < 1000 ; i++ ) {
            ge  = i % 10;
            shi = i / 10 % 10;
            bai = i / 100;
            if ( ge * ge * ge + shi * shi * shi + bai * bai * bai == i ) {
                count += 1;
                System.out.print ( i + " " );
            }
        }
        return count;
    }
}
