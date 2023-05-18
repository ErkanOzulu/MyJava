package day19_LoopPractices;

import java.util.Scanner;

public class PT3_Area_PerimeterOfRectangle {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of the Rectangle:");
            int l = scan.nextInt();
            if (!(l > 0)) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the rectangle:");
            int w=scan.nextInt();
            if (!(w > 0)) {
                System.err.println("Invalid Entry for width of the rectangle");
                System.exit(0);
            }
            double area = w * l;
            double perimeter = 2*(w+l);


            System.out.println("Area of rectangle: " + String.format("%.2f", area));
            System.out.println("Perimeter of rectangle:  " + String.format("%.2f", perimeter));

            System.out.println("Would you like to calculate another Rectangle?");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("invalid entry, re enter (yes or no)");
                ans = scan.next().toLowerCase();
            }
            if (ans.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                System.exit(0);
            }
        }



    }
}
/*
3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


 */