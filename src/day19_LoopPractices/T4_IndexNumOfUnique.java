package day19_LoopPractices;

import java.util.Scanner;

public class T4_IndexNumOfUnique {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch1 == each)
                    count++;
            }

            if (count == 1){
                System.out.println(str.indexOf(ch1));
                break;
            }

          }

    }
}

// 4. Write a program that can return the index number of the first unique character.