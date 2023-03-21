package java作业;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/22 8:54
 * @Author: 曹志阳
 * @Classname 实验八
 * @software :IntelliJ IDEA
 */
public class 实验八 {
    public static void main ( String[] args ) {
        ArrayList a=new ArrayList();
        Random rm=new Random(3);
        String [] arr=new String[]{"大娃","二娃","三娃","四娃","五娃","六娃","七娃"};
        for(int i=0;i<arr.length;i++)
            a.add ( arr[i] );//添加集合元素
        System.out.println (a );
        a.remove ( "三娃" );//指定元素进行删除
        a.remove ( rm.nextInt ( 6) );//随机筛选进行删除
        System.out.println (a );
        System.out.println (a.size () );//查看arraylist现在长度
        System.out.println (a.get ( 3 ) );//获取指定位置的对象
        a.clear ();
    }
}
