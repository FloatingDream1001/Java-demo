package bilbil;

import java.util.Random;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/13 11:07
 * @Author: 曹志阳
 * @Classname random
 * @software :IntelliJ IDEA
 */
public class random {
    public static void main(String[] args){
        Random i=new Random (  );//创建对象
        int r;
        for(int j=0;j<10;j++){
            r=i.nextInt (5)+1;//获取随机数
            System.out.print ( r+" ");
        }


    }
}
