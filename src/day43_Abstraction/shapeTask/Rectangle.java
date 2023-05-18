package day43_Abstraction.shapeTask;

public final class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle( double width, double length) {
        super("Rectangle");
        setLength(length);
       setWidth(width);
    }

    public void setWidth(double width) {
        if (width<=0){
            throw new RuntimeException("Invalid width");
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length<=0){
            throw new RuntimeException("Invalid length");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {

       return 2*(width+length);
    }


}
