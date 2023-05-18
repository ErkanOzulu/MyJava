package day21ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.println(each);
        }

        System.out.println("--------------------------------------");
        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("__________________________________________________");

        String email = "WoodenSpoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("__________________________________________________");

        String s="Today is nice day. Today is monday. Today we learn Java";
        String [] sentences=s.split("\\. ");// important!if you split from "." you need to use \\ --this special character only for "."

        System.out.println(Arrays.toString(sentences));

    }
}
