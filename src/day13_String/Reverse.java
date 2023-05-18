package day13_String;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.next();
             String  result = "";
        int totalChars = word.length();

        if (totalChars < 5) {
            result = "Too short!";

        }else if (totalChars > 5){
            result="Too long!";
        }else {
            result=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

            /*result=word.substring (4)+
                    word.substring (3,4)+ word.substring (2,3) +
                    word.substring (1,2) + word.substring (0,1);

             */

        }

        System.out.println(result);
        scan.close();


    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console
 */