package day13_String;

import java.util.Scanner;
import java.util.SortedMap;

public class T2_longest {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String fWord=  input.next();

        System.out.println("Enter second word");
        String sWord=  input.next();
        String result="";
        int a=fWord.length();
        int b=sWord.length();
        if (a>b){
            result=fWord+" is longest word";
        }else
            result=sWord+" is longest word";

        System.out.println(result);


        input.close();

    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string

 */