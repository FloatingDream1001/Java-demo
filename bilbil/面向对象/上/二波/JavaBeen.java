package bilbil.面向对象.上.二波;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/10 16:02
 * @Author: 曹志阳
 * @Classname JavaBeen
 * @software :IntelliJ IDEA
 */

/**
 * 所谓javabeen,是指符合如下标准的java类
 *      类是公共的
 *      有一个无参的公共构造器
 *      有属性，且有对应的get、set方法
 */

//JavaBeen创建
public class JavaBeen {

    private int ID;
    private String name;

    public JavaBeen(){

    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setID(int i){
        ID=i;
    }
    public int getID(){
        return ID ;
    }

}


