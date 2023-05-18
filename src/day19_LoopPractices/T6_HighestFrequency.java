package day19_LoopPractices;

import java.util.Scanner;

public class T6_HighestFrequency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
       int result = 0;
       String result1="";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1 == ch2) {
                    count++;
                }
            }
            if (result<count) {
                result = count;
                result1 = "" + ch1;
            } else if (result==count) {
                result=count;
                if (!(result1.contains(""+ch1)))
                result1+=""+ch1;
            }
        }

        System.out.println(result1);
    }
}
/*
6.  Write a program that can find the character that has the highest frequency from a string


 */