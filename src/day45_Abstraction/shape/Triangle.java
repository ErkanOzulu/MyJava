package day45_Abstraction.shape;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double sideBottom;
    private double height;

    public Triangle(double side1, double side2, double sideBottom, double height) {
        super("Triangle");
        setSide1(side1);
        setSide2(side2);
        setSideBottom(sideBottom);
        setHeight(height);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSideBottom() {
        return sideBottom;
    }

    public void setSideBottom(double sideBottom) {
        this.sideBottom = sideBottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return sideBottom * height / 2;
    }

    @Override
    public double perimeter() {
        return sideBottom + side2 + side1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString()+
                "side1=" + side1 +
                ", side2=" + side2 +
                ", sideBottom=" + sideBottom +
                ", height=" + height +
                '}';
    }
}
