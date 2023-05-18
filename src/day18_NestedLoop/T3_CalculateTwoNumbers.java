package day18_NestedLoop;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class T3_CalculateTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       double result=0;

        while (true){

            System.out.println("Please enter first number");
          double num1 = scan.nextDouble();
            System.out.println("Please enter a math operator (+,-,/,*)");
            char op = scan.next().charAt(0);

            while (!(op == '+' || op == '-' || op == '/' || op == '*')) {
                System.out.println("Invalid operator, please re enter operator");
                op = scan.next().charAt(0);
            }

            System.out.println("Please enter second number");
            int num2 = scan.nextInt();
            if (op == '+'){
result=num1+num2;
            } else if ( op == '-') {
                result=num1-num2;
            } else if (op == '/') {
                result=num1/num2;
            }else
                result=num1*num2;

            System.out.println(result);
            System.out.println("Do you want to continue");
            String ans=scan.next().toLowerCase();

            while (!(ans.equals("yes")||ans.equals("no"))){
                System.err.println("Invalid entry, please re enter (yes/no)");
                ans=scan.next().toLowerCase();
            }

            if (ans.equals("no"))
                break;
        }




    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
