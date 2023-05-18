package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {


        Square square1=new Square(4);

        System.out.println(square1);

        System.out.println(square1.area());
        System.out.println(square1.perimeter());

        System.out.println("------------------------------");

        Circle circle1=new Circle(3);
        System.out.println(circle1);
        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());

        System.out.println("----------------------------------");

        Rectangle rectangle1=new Rectangle(3,4);
        System.out.println(rectangle1);

        System.out.println(rectangle1.getName());
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.perimeter());
        rectangle1.setWidth(-1);
    }
}
