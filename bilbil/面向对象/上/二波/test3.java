package bilbil.面向对象.上.二波;

/**
 * @ codeing=utf-8
 * @Time : 2022/10/26 14:57
 * @Author: 曹志阳
 * @Classname test3
 * @software :IntelliJ IDEA
 */
public class test3 {
    public static void main ( String[] args ) {
        test3 a1=new test3();
//        //1
////        a1.method();
//        //2
//        int aero=a1.method();
////        System.out.println ("面积为："+aero);
//        System.out.println ("面积为"+a1.method());
        System.out.println ("面积为"+a1.method ( 8,10 ) );

    }



    //3.1
//    public void method(){
//        for ( int i = 0; i <10;i++){
//            for ( int j = 0; j <8;j++){
//                System.out.print ( "* ");
//            }
//            System.out.println ( );
//        }
//    }

    //3.2
//    public int method(){
//        for ( int i = 0; i <10;i++){
//            for ( int j = 0; j <8;j++){
//                System.out.print ( "* ");
//            }
//            System.out.println ( );
//        }
//        return 10*8;
//    }
    public int method( int x,int y){
        for ( int i = 0; i <x;i++){
            for ( int j = 0; j <y;j++){
                System.out.print ( "* ");
            }
            System.out.println ( );
        }
        return x*y;
    }
}
