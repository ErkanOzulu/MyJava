package day45_Abstraction.shape;

public class Sphere extends Shape implements Volume{

private double radius;
public static final double pi=3.14;

    public Sphere(double radius) {
        super("Sphere");
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4*pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public double volume() {
        return (4/3)*pi*radius*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
