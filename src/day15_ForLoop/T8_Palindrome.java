package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class T8_Palindrome {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=scan.next();
        String result="";
        for (int i =word.length()-1 ; i >=0 ; i--) {
            result+=word.charAt(i);
        }
        System.out.println(result.toLowerCase());
        System.out.println(word.toLowerCase());

        /*if (result.toLowerCase().equals(word.toLowerCase()) ){
            System.out.println(true);
        }else
            System.out.println(false);
            */

        //  boolean isPalindrome = str.equalsIgnoreCase(result);
     boolean valid=result.toLowerCase().equals(word.toLowerCase());
     System.out.println(valid);
    }
}
/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */