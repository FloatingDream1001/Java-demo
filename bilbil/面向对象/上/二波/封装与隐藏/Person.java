package bilbil.面向对象.上.二波.封装与隐藏;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/9 22:42
 * @Author: 曹志阳
 * @Classname Person
 * @software :IntelliJ IDEA
 */
public class Person {
    private int age;
    public void setAge(int a) {
        if (a<0||a>130){
            System.out.println ("传入数据非法" );
            return;
        }
        age = a;
    }
    public int GetAge() {
        return age;
    }
}
