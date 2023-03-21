package bilbil;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/10 20:50
 * @Author: 曹志阳
 * @Classname 求和
 * @software :IntelliJ IDEA
 */
public class 求和 {
    public static void main(String[] args){
        int sum=0;
        for(int i=2;i<=100;i+=2)
            sum+=i;
        System.out.println ( sum );
    }
}
