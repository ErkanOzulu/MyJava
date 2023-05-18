package day13_String;

import java.util.Scanner;

public class T4_InitialUpLow {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name ");
        String fName=scan.next();

        System.out.println("Please enter your last name");
        String lName=scan.next();

        char f=fName.charAt(0);
        char b=lName.charAt(0);

String result=f+"."+b;
        System.out.println(result.toUpperCase());

scan.close();



    }
}
/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

 */