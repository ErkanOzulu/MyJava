package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractise {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) { // while the age is invalid
                System.out.println("Invalid entry.Please re enter your age.");
                age = scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("Invalid entry, please re enter.Would you like to continue");
                ans = scan.next().toLowerCase();
            }


            if (ans.equals("no"))
                break;
        }

scan.close();
    }
}
