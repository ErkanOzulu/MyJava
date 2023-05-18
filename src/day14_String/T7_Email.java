package day14_String;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class T7_Email {
    public static void main(String[] args) {


        System.out.println("Please enter your email");
        String email = new Scanner(System.in).nextLine();
if (email.contains("_")){
    String name=email.substring(0,email.indexOf("_"));
    String surName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
    String result=surName+"_"+name+email.substring(email.indexOf("@"));
    System.out.println(result);
}else
    System.out.println(email);


    }
}
/*
 7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */