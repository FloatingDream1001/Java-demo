package java作业;

import java.util.*;

/**
 * @ codeing=utf-8
 * @Time : 2022/5/13 11:27
 * @Author: 曹志阳
 * @Classname 拼写风暴1
 * @software :IntelliJ IDEA
 */
public class 拼写风暴1 {
    public static void main ( String[] args ) {
        Map<String, String> hm = new HashMap<>();
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

        System.out.println("输出的key为：" + getKey(hm, "c"));
    }
    public static Object getKey(Map map, Object value){
        List<Object> keyList = new ArrayList<> ();
        for(Object key: map.keySet()){
            if(map.get(key).equals(value)){
                keyList.add(key);
            }
        }
        return keyList;
    }
}
