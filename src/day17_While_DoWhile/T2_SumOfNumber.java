package day17_While_DoWhile;

import java.util.Scanner;
import java.util.SortedMap;

public class T2_SumOfNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int a = scan.nextInt();
        int result = 0;

        while (!(a < 0)) {

            result += a;
            System.out.println(result);
            a = scan.nextInt();
        }
scan.close();


        }
    }

/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */