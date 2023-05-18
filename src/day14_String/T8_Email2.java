package day14_String;

import java.util.Scanner;

public class T8_Email2 {
    public static void main(String[] args) {

        System.out.println("Enter your email");
        String email=new Scanner(System.in).nextLine();

        String firstName=email.substring(0,email.indexOf("_"));
        String surName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

      firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
      surName=surName.substring(0,1).toUpperCase()+surName.substring(1).toLowerCase();

        System.out.println("First name : " + firstName);
        System.out.println("Surname : " + surName);
        System.out.println("domain : " + domain);
    }
}
/*
8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple


 */