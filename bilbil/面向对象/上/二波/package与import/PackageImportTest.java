package bilbil.面向对象.上.二波.package与import;

import java.util.Scanner;

import static java.lang.Math.round;


/**
 * 一、package关键字使用
 * 1.为了更好实现项目中类的管理，提供包的概念
 * 2.使用package声明类或接口的包
 * 3.见名真意，每.一次就代表一层目录
 *
 * ！！！不能同一个包下命名相同接口、类
 *
 * 二、import关键字使用
 * 1.在原文件中导入指定包下的目录
 * 2.使用.*就是把包下所有文件调取
 * 3.如果使用的类或接口在java.long就不需要调取
 * 4.若果使用的类或接口是本包下的不用调去
 *5.如果在源文件中使用不同包下的命名相同文件，则必须至少一个类以全命名方式来区分
 * 6.import static:导入指定类或接口中的静态结构static：属性或方法。
 */
public class PackageImportTest {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        java.util.Date date = new java.util.Date();
        Math.round ( 123.2 );
        round(23.4);//

    }
}
