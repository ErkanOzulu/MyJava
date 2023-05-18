package day20_Arrays;

import java.util.Scanner;

public class Cn4_AverageNumber {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter ");
        int length=scan.nextInt();
        int[] numbers=new int[length];
        double sum=0;
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter a number");
            numbers[i]=scan.nextInt();
            sum+=numbers[i];
        }
      double averageNumber=sum/numbers.length;
        System.out.println(averageNumber);



    }
}
/*
	4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */