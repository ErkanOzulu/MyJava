package day15_ForLoop;

import java.util.Scanner;

public class T3_calculate {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter number");
        int number=scan.nextInt();
        int sum=0;
        for (int i = 1; i <number+1 ; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum);
        scan.close();
    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */