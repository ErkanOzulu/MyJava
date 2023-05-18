package day15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();
        scan.close();

        int l = word.length();
        String reverse = "";

        for (int i = l - 1; i >= 0; i--) {

           char rev = word.charAt(i);
            reverse += "" + rev;

        }

        System.out.println(reverse);

    }
}
/*
Tasks:
	1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123

 */