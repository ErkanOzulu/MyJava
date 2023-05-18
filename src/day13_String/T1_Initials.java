package day13_String;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class T1_Initials {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName=scan.next(); // "Java"
        System.out.println("Enter your last name");
        String lastName=scan.next();

        char f=firstName.charAt(0);
        char l=lastName.charAt(0);
        String initial =f+"."+l;
        System.out.println("initial = " + initial);
scan.close();

    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */