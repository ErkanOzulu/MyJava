package day19_LoopPractices;

import java.util.Scanner;

public class PT2_Area_PerimeterOfSquare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square:");
            int s = scan.nextInt();

            double area = s * s;
            double perimeter = 4 * s;

            if (!(s > 0)) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            System.out.println("Area of square: " + String.format("%.2f", area));
            System.out.println("Perimeter of square:  " + String.format("%.2f", perimeter));

            System.out.println("Would you like to calculate another Square?");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("invalid entry, re enter (yes or no)");
                ans = scan.next().toLowerCase();
            }
            if (ans.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                System.exit(0);
            }
        }
    }
}

/*

	2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */