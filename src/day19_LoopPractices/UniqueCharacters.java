package day19_LoopPractices;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch1 == each)
                    count++;
            }
            /* if (count == 1)
                result += ch1;
            */
            if (count != 1)
                continue;
            result += ch1;
        }


        System.out.println(result);
    }
}


/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */