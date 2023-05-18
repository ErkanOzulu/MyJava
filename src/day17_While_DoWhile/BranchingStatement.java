package day17_While_DoWhile;

import day04_Variables.SalaryCalculator;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {


        for (char i = 'A'; i <='Z' ; i++) {

            if (i=='F'){
                break;
            }  System.out.print(i+" ");
        }
        System.out.println("_________________________________");

        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter a number: ");
            int num=scan.nextInt();
            if (num<0){
                break;
            }

        }
        System.out.println("_________________________________");

    }
}
