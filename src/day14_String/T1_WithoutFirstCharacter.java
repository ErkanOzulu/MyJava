package day14_String;

import java.util.Scanner;

public class T1_WithoutFirstCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firs word");
        String word1=scan.next();
        System.out.println("Enter second word");
        String word2=scan.next();
        scan.close();

       String result=word1.substring(1,word1.length());
        result+=word2.substring(1,word2.length());
        System.out.println(result);

    }
}
/*
    1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */