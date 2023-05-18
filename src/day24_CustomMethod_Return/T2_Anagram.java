package day24_CustomMethod_Return;

import java.util.Arrays;

public class T2_Anagram {
    public static void main(String[] args) {

        String str1="abc";
        String str2="bac";
        isAnagram(str1,str2);

    }

    public static boolean isAnagram(String word1, String word2){

char[] ch1=word1.toCharArray();
char[] ch2=word2.toCharArray();

String result="";
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println(anagram);
        return anagram;
    }
}
/**
 2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
 Ex:
 str1 = "cba"
 str2 = "bac";

 isAnagram(str1, str2) ====> true
*/
