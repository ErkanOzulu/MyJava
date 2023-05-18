package day14_String;

import java.util.Scanner;
import java.util.SortedMap;

public class T2_PrintReally {
    public static void main(String[] args) {

        System.out.println("Please enter any word");
        String word=new Scanner(System.in).next();

        String result="";
        if (word.substring(word.length()-2).equals("ly")){

            result="really???";
        }else
            result="never mind";


        System.out.println(result);
    }
}
/*
  2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
  otherwise, print "never mind"

 */