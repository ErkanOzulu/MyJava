package day23_CustomMethods_Void;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class T16_FullName {
    public static void main(String[] args) {
        String[] fullName = {"cYdEo", "SCHOOL"};
        nameOfPerson(fullName);
    }

    public static void nameOfPerson(String[] fullName) {

        for (String each : fullName) {
            each = each.toLowerCase();

            System.out.print(each.substring(0, 1).toUpperCase() + each.substring(1)+" ");
        }
    }

}

/*
	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


 */