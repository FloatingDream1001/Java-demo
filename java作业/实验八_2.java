package java作业;

import java.util.LinkedList;
import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/22 9:34
 * @Author: 曹志阳
 * @Classname 实验八_2
 * @software :IntelliJ IDEA
 */
public class 实验八_2 {
    public static void main ( String[] args ) {
        LinkedList l=new LinkedList();
        String []a=new String []{"赵云","安其拉","夏洛特"};
        String []b=new String []{"法师","战士","打野"};
        Random rand = new Random (3);
        Hero [] heros =new Hero[3];
        for( int i=0; i<heros.length; i++){
            heros[i]=new Hero();
            heros[i].name=a[i];
            heros[i].classname=b[rand.nextInt ( 3 )];
        }
        for(int i=0;i<heros.length;i++)
            l.add ( heros[i] );
//        System.out.println (l. );
    }
}
class Hero{
    String name;
    String classname;

}