package day17_While_DoWhile;

import java.util.Scanner;

public class T3_Operator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scan.nextInt();
        System.out.println("Please enter second number");
        int num2 = scan.nextInt();
        System.out.println("Please enter operator");
        char operator = scan.next().charAt(0);
        int result = 0;


        /*after some try I understood that while doesn't contain boolean variable
        boolean validOperator=(operator == '+' || operator == '-' || operator == '/' || operator == '*');

        while (!validOperator) ===>> it doesn't work */
        while (!(operator == '+' || operator == '-' || operator == '/' || operator == '*')) {
            System.out.println("Invalid Operator! Please re-enter operator");
            operator = scan.next().charAt(0);
        }

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else
            result = num1 * num2;


        System.out.println(result);
    }
}

/*

    3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */