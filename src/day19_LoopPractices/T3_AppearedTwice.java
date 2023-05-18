package day19_LoopPractices;

import java.util.Scanner;

public class T3_AppearedTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
String result="";
        System.out.println("Please enter any string");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) {
                    count++;
                }
            }
             if (!(count == 2)) {
                continue;
            }
             if (!(result.contains(""+ch))){
             result+=""+ch;}


        }
        System.out.println(result);

    }
}
/*
3. Write a program that can display all the characters that appeared twice in the string.


 */