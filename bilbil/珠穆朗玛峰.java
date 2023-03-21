package bilbil;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/12 19:58
 * @Author: 曹志阳
 * @Classname 珠穆朗玛峰
 * @software :IntelliJ IDEA
 */
public class 珠穆朗玛峰 {
    public static void main ( String[] args ) {
        int height = 8844430, count = 0;
        double i = 0.1;
        while (i <= height) {
            i *= 2;
            System.out.print ( i + " " );
            count++;
        }
        System.out.println ( count );
    }
}
