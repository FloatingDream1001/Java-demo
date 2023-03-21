package bilbil.面向对象.上.二波.构造器;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/10 15:41
 * @Author: 曹志阳
 * @Classname TriAngle
 * @software :IntelliJ IDEA
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle ( double b, double h ) {
        base   = b;
        height = h;
    }

    public TriAngle ( ) {

    }

    public void SetBase ( double b ) {
        base = b;
    }

    public double GetBase ( ) {
        return base;
    }

    public void SetHeight ( double h ) {
        height = h;
    }

    public double GetHeight ( ) {
        return height;
    }
}
