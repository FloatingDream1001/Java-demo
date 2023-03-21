package java作业;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/2 15:49
 * @Author: 曹志阳
 * @Classname 初始接口
 * @software :IntelliJ IDEA
 */
interface bike {
    String brand = "二八大纲";

    public void ability ();
}

interface flane {

    public void ability1 ();
}

class GuangtoupaiCar implements bike, flane {
    String name = "光头强牌";

    static String info () {
        return bike.brand;
    }

    public void ability () {
        System.out.println ( "两个车轮，在陆上能跑" );
    }

    public void ability1 () {
        System.out.println ( "有翅膀，在天上可以飞" );
    }
}

class demo {
    public static void main ( String[] args ) {
        GuangtoupaiCar p1 = new GuangtoupaiCar ( );
        System.out.println ( p1.name + p1.info ( ) + "飞行器" );
        p1.ability ( );
        p1.ability1 ( );

    }
}