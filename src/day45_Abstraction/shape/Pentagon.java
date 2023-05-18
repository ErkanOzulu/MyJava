package day45_Abstraction.shape;

public class Pentagon extends Shape{

    private double side;
    private double height;

    public Pentagon(double side, double height) {
        super("Pentagon");
        setHeight(height);
        setSide(side);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (side*height)/2*5;
    }

    @Override
    public double perimeter() {
        return 5*side;
    }
}
