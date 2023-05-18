package day23_CustomMethods_Void;

import java.util.Arrays;

public class T13_PrintEachChar {

    public static void main(String[] args) {

        printEachChar("Ahmet");
    }
    public static void printEachChar(String each){
        String result="";
        for (int i = 0; i <each.length() ; i++) {
           result+=each.charAt(i)+", ";
        }
        System.out.println(result);
    }
}
/*
13. create a method named printEachChar that can print each characters of a string
 */