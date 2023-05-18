package day16_ForLoopStringPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class T1_CountPositiveNegative {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number for 5 times");
        int positive=0;
        int negative=0;

        for (int i = 1; i <6 ; i++) {
         int num=scan.nextInt();
            if (num>0){
                positive++;
            }
            if (num<0){
                negative++;
            }
        }

        System.out.println(positive+" positive and "+negative+" negative");

    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */