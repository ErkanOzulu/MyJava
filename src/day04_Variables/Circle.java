package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double radius = 5.5;
        double PI = 3.14;
        double diameter = 2 * radius; // finds the diameter by multiplying the radius to 2
        double area = PI * radius * radius; // finds the area of the circle
        double perimeter = diameter * PI; // finds the perimeter of the circle
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
/*
 *3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
 * 			PI, radius, diameter, area, perimeter

 * 					Hints: 	PI = 3.14
 * 							area = radius * radius * PI
 * 							Perimeter = 2 * radius * PI
 */


}
