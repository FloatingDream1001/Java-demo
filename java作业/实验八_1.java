package java作业;
import java.util.LinkedList;
import java.util.Random;
/**
 * @ codeing=utf-8
 * @Time : 2022/4/22 9:12
 * @Author: 曹志阳
 * @Classname 实验八_1
 * @software :IntelliJ IDEA
 */
public class 实验八_1 {
    public static void main ( String[] args ) {
        LinkedList y =new LinkedList();
        Random rm=new Random(3);
        String [] arr=new String[]{"大娃","二娃","三娃","四娃","五娃","六娃","七娃"};
        for( int i=0; i<arr.length; i++)
             y.add ( arr[i] );//添加集合元素
        System.out.println ( y );
        y.remove ( "三娃" );//指定元素进行删除
        y.remove ( rm.nextInt ( 6) );//随机筛选进行删除
        System.out.println ( y );
        System.out.println ( y.size () );//查看arraylist现在长度
        System.out.println ( y.get ( 3 ) );//获取指定位置的对象
        y.addFirst ( "爷爷" );//在首部添加对象
        y.addLast ( "蛇精" );//在尾部添加对象
        System.out.println (y.getFirst () );//获取首个对象
        System.out.println (y.getLast () );//在尾部添加对象
        y.removeFirst ();//在首部删除对象
        y.removeLast ();//在尾部删除对象
        System.out.println (y );
    }
}
