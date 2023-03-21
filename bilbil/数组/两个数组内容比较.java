package bilbil.数组;

/**
 * @ codeing=utf-8
 * @Time : 2022/3/26 10:27
 * @Author: 曹志阳
 * @Classname 两个数组内容比较
 * @software :IntelliJ IDEA
 */
public class 两个数组内容比较 {
    public static void main ( String[] args ) {
        int []arr={1,2,3,4};
        int []arr2={1,2,3,4};
        boolean flag=bijao ( arr,arr2 );
        System.out.println (flag );
    }
    public static boolean bijao(int []arr,int []arr2){
    if(arr.length!=arr2.length){
        return false;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr2[i]){
            return false;

        }
    }
    return true;
    }

}
