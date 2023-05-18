package day16_ForLoopStringPractice;

import java.util.*;

public class replit {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:

    Boolean a=word.startsWith("java");
    Boolean b=word.substring(1,word.length()).startsWith("java");
    String result="";
    if (a || b){
        result="true";
    }else
        result="false";

        System.out.println(result);
    }
}




