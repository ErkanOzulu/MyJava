package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;
    private double height;

    public Cylinder( double radius, double height) {
        super("Cylinder");
       setRadius(radius);
       setHeight(height);
    }

    public static final double pi=3.14;

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Invalid radius: "+radius);
        }
        this.radius = radius;
    }

    public void setHeight(double height) {
        if (height<=0){
            throw new RuntimeException("Invalid height: "+height);
        }
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 2*pi*radius*radius+2*pi*radius*height;
    }

    @Override
    public double perimeter() {
        return 2*(2*radius+height);
    }

    @Override
    public double volume() {
        return pi*radius*radius*height;
    }
}
