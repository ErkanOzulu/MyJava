package day14_String;

import java.util.Scanner;

public class T5_CharacterAnalysis {
    public static void main(String[] args) {

        System.out.println("Please enter a word");

        String word = new Scanner(System.in).next();
        String result = "";

        char a = word.charAt(0);

        if (a >= '0' && a <= '9') {

            result = "first character is digit";

        } else if (a >= 'a' && a <= 'z') {
            result = "first character is lowercase letter";

        } else if (a >= 'A' && a <= 'Z') {
            result = "first character is uppercase letter";
        }else
            result="first character is special character";

        System.out.println(result);
    }
}
/*

 5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table


 */