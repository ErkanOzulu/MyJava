package day22MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words=sentence.split(" ");// [I, love, Java]

        String reverse="";

        for (int i = words[1].length()-1; i >=0 ; i--) {
            reverse+=words[1].charAt(i);
        }
        System.out.println(reverse);

       /* First way
       sentence= sentence.replaceFirst(words[1],reverse);
         System.out.println(sentence);

                            Second way
        */

        words[1]=reverse;
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.print(word+" ");
        }
        System.out.println();

        System.out.println("================other option===============");

        String result="";
        for (String word : words) {
            result+=word+" ";
        }
        System.out.println(result);
    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java



 */