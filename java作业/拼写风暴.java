package java作业;
import java.util.*;
/**
 * @ codeing=utf-8
 * @Time : 2022/5/13 10:09
 * @Author: 曹志阳
 * @Classname 拼写风暴
 * @software :IntelliJ IDEA
 */
public class 拼写风暴 {
    public static String getKey( Map map, Object value){
        List<Object> keyList = new ArrayList<>();
        for(Object key: map.keySet()){
            if(map.get(key).equals(value)){
                keyList.add(key);
            }
        }
        String toString = keyList.toString();
        return toString;
    }
    public static void main ( String[] args ) {
        Map<String, String> hm = new HashMap<>();
        HashSet errors = new HashSet();
        Scanner sc=new Scanner ( System.in);
        Random rm=new Random ();
        hm.put("dog","狗");
        hm.put("cat","猫");
        hm.put("bird","鸟");
        hm.put("bat","蝙蝠");
        hm.put("pig","猪");
        hm.put("horse","马");
        hm.put("elephant","大象");
        hm.put("chicken","鸡");
        hm.put("fish","鱼");
        hm.put("monkey","猴子");
        ArrayList arr=new ArrayList();
        Set<Map.Entry<String, String>> ms =hm.entrySet();
        int i=0;
        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next ( );
            arr.add(entry.getValue ( ));
        }
        System.out.println ("今日挑战个数为"+hm.size()+"\n**********开始挑战**********" );
        while (hm.size ()>0) {
            String x= (String) arr.get ( rm.nextInt ( hm.size () ) );
            System.out.println (x );
            System.out.println ("请输出英文：" );
            String y=sc.next ();
            if(hm.get ( y )==x){
                System.out.println ("输入成功" );
                hm.remove ( y );
                arr.remove ( x );
                System.out.println ( );
            }
            else{
                System.out.println ("输入失败" );
                StringBuffer s=new StringBuffer(y);//错误的英文
                String b=  getKey ( hm, x );//用正确的英文找汉语
                StringBuffer s1=new StringBuffer (b);
                s1.deleteCharAt ( 0 ).deleteCharAt ( s1.length ()-1 );
                char charArr [] = s.toString().toCharArray();//把错误的英文每个字符存入数组里
                char charArr1 [] = s1.toString().toCharArray();//把正确的英文每个字符存入数组里
                errors.add ( s1+":"+x);
                for (int z=0;z<charArr.length;z++)
                {
                    if(charArr[z]!=charArr1[z]){
                        for(int j=z;j<charArr1.length;j++){
                            String z1 = String.valueOf ( charArr1[j] );
                            System.out.format ("\33[31m%s",z1 );
                        }
                        System.out.println ("\33[30m\n" );
                        break;
                        }
                    System.out.print ( charArr1[z] );
                    }
                }
            }
            System.out.println ("恭喜完成任务" );
            System.out.println ("今天的错误是"+errors );
        }
    }


