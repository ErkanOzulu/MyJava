package day16_ForLoopStringPractice;

import java.util.Scanner;
import java.util.SortedMap;

public class T2_FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a string");
        String word=scan.nextLine();
        System.out.println("Please enter a character");
       char ch=scan.next().charAt(0);
        int frequency=0;

        for (int i = 0; i <word.length(); i++) {
           char eachChar=word.charAt(i);
            if (eachChar==ch){
                frequency++;
            }
                }
        System.out.println(frequency);

    }
}
/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char
from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4


 */