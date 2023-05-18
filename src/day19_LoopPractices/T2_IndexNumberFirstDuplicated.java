package day19_LoopPractices;

import java.util.Scanner;

public class T2_IndexNumberFirstDuplicated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter any string");
        String str = scan.next();
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (each == ch) {
                    count++;
                }
            }

            if (count == 2) {

                index = str.indexOf(ch);
                break;
            }

        }

        System.out.println(index);


    }
}
/*
2. Write a program that can return the index number of the first duplicated character from a string
 */