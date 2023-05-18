package day24_CustomMethod_Return;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String result = "";

        String[] ch = str.split("");

        for (String each : ch) {

            if (!(result.contains(each)))
                result+=each;

        }


        return result;
    }
}