package firstpackage;

public class Trapezoid implements Shape {

    public double height;
    public double base1;
    public double base2;

    public Trapezoid() {
        height = 0;
        base1 = 0;
        base2 = 0;
    }

    public Trapezoid(double _height,double _base1,double _base2) {
        height = _height;
        base1 = _base1;
        base2 = _base2;
    }

    public void setBase1(double _base1) {
        base1 = _base1;
    }

    public void setBase2(double _base2) {
        base2 = _base2;
    }

    public void setHeight(double _height) {
        height = _height;
    }

    @Override
    public double getArea() {
        return((base1+base2)*height/2);
    }
}
