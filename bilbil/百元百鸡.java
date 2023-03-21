package bilbil;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 9:48
 * @Author: 曹志阳
 * @Classname 百元百鸡
 * @software :IntelliJ IDEA
 */
public class 百元百鸡 {
    public static void main ( String[] args ) {
        for(int gongji=0;gongji<=20;gongji++){
            for ( int muji=0;muji<=33;muji++ ){
                int xiaoji=100-gongji-muji;
                if(xiaoji%3==0&&5*gongji+3*muji+xiaoji/3==100){
                    System.out.println ("公鸡数为"+gongji+"母鸡数为"+muji+"小鸡数为"+xiaoji );
                }
            }
        }
    }
}
