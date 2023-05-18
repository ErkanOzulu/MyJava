package day14_String;

import java.util.Scanner;

public class T3_WithoutX {
    public static void main(String[] args) {
        System.out.println("Enter any word");

        String word=new Scanner(System.in).next();
        String result="";
        if (word.startsWith("x")){
            result=word.substring(1);

        }
        System.out.println(result);

    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */