package day18_NestedLoop;

import java.util.Scanner;

public class T4_FrequencyOfCharacter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next().toLowerCase( );
        String add = "";
        String result="";


        for (int i = 0; i < str.length(); i++) {
           char ch1 =  str.charAt(i);
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                char ch2=str.charAt(j);
                if (ch2==ch1){
                    count++;
            }
            }

                if (!(add.contains(""+ch1)))
                    add += ""+ch1 + count;



        }
        System.out.println(add);
        scan.close();

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