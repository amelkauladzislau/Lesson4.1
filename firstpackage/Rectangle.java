package firstpackage;

public class Rectangle implements Shape {
    private double length;
    private double high;

    public Rectangle(){
        length = 0;
        high = 0;
    }

    public  Rectangle(double _length, double _high){
        length = _length;
        high = _high;
    }

    public void setLength(double _length){
        length = _length;
    }

    public void setHigh(double _high){
        high = _high;
    }

    @Override
    public double getArea() {
        return length * high;
    }
}
