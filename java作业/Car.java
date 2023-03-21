package java作业;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/1 8:54
 * @Author: 曹志阳
 * @Classname Car
 * @software :IntelliJ IDEA
 */
abstract class Car {
    String leibie;//货车，载客车，二轮车，三轮车
    String pinpai;

    void Show () {
        System.out.println ( "会跑" );

    }

    abstract void didi ();
}

class Jiaoche extends Car {


    String ability () {
        return "主要功能：载人";
    }

    void didi () {
        System.out.println ( "喷气浪" );
    }
}

class Baoma extends Jiaoche {
    public String ability () {
        return super.ability ( ) + "双座，拉风";
    }

    String name = "宝马";

    void value () {
        System.out.println ( "外购超百万" );
    }
}

