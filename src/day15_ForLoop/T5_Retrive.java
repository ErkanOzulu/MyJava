package day15_ForLoop;

import java.util.Scanner;

public class T5_Retrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word that includes letter, character, digit");
        String in = input.nextLine();

        String digits = "",
                letters = "",
                specialChar = "";

        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    specialChar += ch;
                }
                //  specialChar+=ch;

            }


        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("SpecialChar = " + specialChar);

    }
}
/*
 5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */