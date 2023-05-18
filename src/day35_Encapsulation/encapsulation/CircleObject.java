package day35_Encapsulation.encapsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1=new Circle(3);
        circle1.calcArea();
        circle1.calcPerimeter();


        circle1.setRadius(2);
        circle1.calcArea();
        circle1.calcPerimeter();

    }
}
