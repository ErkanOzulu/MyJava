package day15_ForLoop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class T4_Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt(),
                result=1;
        scan.close();

        for (int i = num; i>0; i--) {
           result =i*result;

        }
        System.out.println("result = " +result);


    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */