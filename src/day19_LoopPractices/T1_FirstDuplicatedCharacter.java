package day19_LoopPractices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class T1_FirstDuplicatedCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter any string");
        String str = scan.next();
      String  duplicate ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (each == ch) {
                    count++;
                }

            }

            if (count == 2){
                duplicate=""+ch;
                break;}

        }

        System.out.println(duplicate);
    }

}

/*
1. Write a program that can return the first duplicated character from a string
 */