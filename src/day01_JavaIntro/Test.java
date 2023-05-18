package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;
import utilities.StringUtility;


public class Test {
    public static void main(String[] args) {
     String str="aaaaaaaaaaaaaaabbbbbbbbbbbcccc";

        str= ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name="Java Programing";

        String reversedName=ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);

        System.out.println("---------------------------");

        StringUtility.printEachChar(name);

    }
}
