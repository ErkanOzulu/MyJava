package day18_NestedLoop;

import java.util.Scanner;

public class T5_UniqueCharacter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str=scan.next().toLowerCase();
        String unique="";

        for (int i = 0; i <str.length() ; i++) {
            char ch1=str.charAt(i);
            int count=0;

            for (int j = 0; j <str.length() ; j++) {
                char ch2=str.charAt(j);

                if ((ch2==ch1))
                    count++;
            }
                    if (count==1)
                        unique+=""+ch1;



            }
        System.out.print(unique);

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