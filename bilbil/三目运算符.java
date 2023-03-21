package bilbil;
public class 三目运算符 {
    public static void main (String[] args){

        int i,j,max,k;
        i=10;
        j=20;
        k=30;
//        获取两个数中的较大值
        max=i>j?i:j;
        boolean b=i==j?true:false;
        System.out.println (max);
        System.out.println (b);
        //_________________________
        int t=i>j?i:j;
        t=t>k?t:k;
        System.out.println (t);
    }
}
