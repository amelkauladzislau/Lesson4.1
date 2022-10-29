package firstpackage;

public class Triangle implements Shape {

    public double height;
    public double base;

    public Triangle() {
        height = 0;
        base = 0;
    }

    public Triangle(double _height,double _base) {
         height = _height;
         base = _base;
    }

    public void setBase(double _base) {
        base = _base;
    }

    public void setHeight(double _height) {
        height = _height;
    }

    @Override
    public double getArea() {
        return(0.5*base*height);
    }
}
