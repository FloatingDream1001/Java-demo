package bilbil.面向对象.上;

/**
 * @ codeing=utf-8
 * @Time : 2022/4/17 16:26
 * @Author: 曹志阳
 * @Classname person
 * @software :IntelliJ IDEA
 */
public class Person {
    String name;
    int age;
    /**
     * sex:1表明是男性
     * sex:0表明是女性
     */
    int sex;

    public void study ( ) {
        System.out.println ( "studying" );
    }

    void showAge ( ) {
        System.out.println ( "age:" + age );
    }

    int addAge ( int value ) {
        return age + value;
    }
}
