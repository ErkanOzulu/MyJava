package day13_String;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class T7_CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first word");
        String word1 = scan.next();
        System.out.println("Please enter second word");
        String word2 = scan.next();
        System.out.println("Please enter third word");
        String word3 = scan.next();
        scan.close();
        String result="";
        int a=word1.length();
        int b=word2.length();
        int c=word3.length();
        if (a==b && b==c){
            result="All words are same length";
        } else if ((a == b && b != c)||(a != b && b == c)||(a==c&&c!=b)) {
            result="Not Same nor Different lengths";
        }else
            result="All different length";

        System.out.println(result);

    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"


 */