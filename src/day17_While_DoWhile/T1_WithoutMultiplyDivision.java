package day17_While_DoWhile;

import java.util.Scanner;

//Task 1
public class T1_WithoutMultiplyDivision {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first positive number for multiply");
        int a = scan.nextInt();
        System.out.println("Enter second positive number for multiply");
        int b = scan.nextInt();
        int c = 0;
        //Multiplication
        if (a > 0 && b > 0) {
            for (int i = 1; i <= b; i++) {
                c += a;
            }
            System.out.println("Multiplication result is " + c);
        } else
            System.out.println("Invalid number!");


        System.out.println("_______________________Division___________________________");
//Division

        System.out.println("Enter dividend(numerator)");
        int d = scan.nextInt();
        System.out.println("Enter divisor(denominator)");
        int e = scan.nextInt();
        int result = 0;
        if (d > 0 && e > 0) {
            while (!(d - e < 0)) {
                d -= e;
                result++;
            }

            System.out.println("Division result is " + result + " and remainder is " + d);
        } else
            System.err.println("Invalid number!");


        System.out.println("----------------Second Way--------------------");

        int a1 = 50; //a =30-7=23-7=16 -7 =9 - 7 = 2
        int b1 = 9;

        int count = 0; // count = 1+1=2+1 = 3+1 =4

       while (a1>=b1){
           a1-=b1;
           count++;
       }

        System.out.println(count+" with a remainder of "+a1);
    }
}

/*
	1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

 */


