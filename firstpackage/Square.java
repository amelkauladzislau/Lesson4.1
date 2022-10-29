package firstpackage;

public class Square implements Shape {

    public Square(){
        length = 0;
    }

    public Square(double _length){
        length = _length;
    }

    public void setLength(double _length){
        length = _length;
    }

    private double length;

    @Override
    public double getArea() {
        // Some tricky calculations
        return length * length;
    }
}
