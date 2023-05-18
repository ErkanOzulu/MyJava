package day43_Abstraction.shapeTask;

public final class Circle extends Shape{

    private double radius;
    private final double pi=3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Invalid radius");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
      return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }
}
