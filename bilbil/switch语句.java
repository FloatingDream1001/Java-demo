package bilbil;
import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/6 16:12
 * @Author: 曹志阳
 * @Classname switch语句
 * @software :IntelliJ IDEA
 */
public class switch语句 {
    public static void main(String[] args){
        Scanner sc=new Scanner ( System.in );
        char a;
        System.out.println ( "请输入月份：" );
        int month=sc.nextInt ();
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println ( month+"月为冬天" );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println ( month+"月为春天" );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println ( month+"月为夏天" );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println ( month+"月为秋天" );
                break;
            default:
                System.out.println ( "请输入正确的月份" );
        }

    }
}
