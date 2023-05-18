package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{


    public Cube( double side) {
        super("Cube");
        this.side = side;
    }

    private double side;

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 6*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("Invalid side: "+side);
        }
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
