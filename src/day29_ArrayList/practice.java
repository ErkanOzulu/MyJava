package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        String str = "1-16 of 462 results for";


        String str1 = str.substring(8, str.indexOf(" results"));

        int result = Integer.parseInt(str1);
        System.out.println(result + 1);




    }



}