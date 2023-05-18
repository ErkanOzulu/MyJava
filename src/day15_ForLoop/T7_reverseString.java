package day15_ForLoop;

import java.util.Scanner;

public class T7_reverseString {
    public static void main(String[] args) {
        String result="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");


        String word=scan.nextLine();
        for (int i =word.length()-1; i >=0 ; i--) {
             result+=word.charAt(i);
        }
        System.out.println(result);
scan.close();
    }
}
/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */