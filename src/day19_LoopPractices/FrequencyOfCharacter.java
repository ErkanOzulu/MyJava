package day19_LoopPractices;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {




        Scanner scan=new Scanner(System.in);
        String str=scan.next();

        String result="";




        for (int i = 0; i <str.length() ; i++) {
            char ch1=str.charAt(i);
            int count=0;

            for (int j = 0; j <str.length() ; j++) {
                char ch2=str.charAt(j);

                if (ch1==ch2)
                    count++;
            }

            if (result.contains(""+ch1))
            continue;

            result+=ch1;
            result+=count;
            /*
            if (!(result.contains(""+ch1)))
             result+=""+ch1+count;
             */

        }
        System.out.println(result);



    }
}

/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */