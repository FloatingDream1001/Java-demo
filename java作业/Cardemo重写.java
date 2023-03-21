package java作业;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/1 9:41
 * @Author: 曹志阳
 * @Classname Cardemo
 * @software :IntelliJ IDEA
 */
public class Cardemo重写 {
    public static void main ( String[] args ) {
        MoxingCar p1 = new MoxingCar ( );
        p1.leibie = "载客车";
        System.out.println ( p1.leibie + " " + p1.name );
        p1.Show ( );
        p1.ability ( );
        p1.value ( );


    }
}

final class MoxingCar extends Baoma {
    public void value () {
        System.out.println ( "只是模型值得收藏" );
    }
}




