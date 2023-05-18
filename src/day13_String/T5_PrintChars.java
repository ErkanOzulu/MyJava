package day13_String;

import java.util.Scanner;

public class T5_PrintChars {
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine(); //if you use next,it ignores "enter" before writing text
scan.close();
        int a= str.length();
        String result="";
      //str.trim().isEmpty();
        if ( a==0){
            result="string is empty";
        } else if (a>3) {
            result=str.substring(str.length()-3);
        }else
            result=str;

        System.out.println(result);
        scan.close();



    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */