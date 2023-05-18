package day52_Map_FunctionalInterface;

import java.util.*;

public class T1_Frequency {
    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String, Integer> map = new LinkedHashMap<>();

        int max = Integer.MIN_VALUE;

        for (String each : arr) {

            int frequency = Collections.frequency(Arrays.asList(arr), each);

            if(frequency>max){

                max= frequency;
            }

            map.put(each, frequency);

            }

        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue()==max){
                    System.out.println("highest frequency = "+entry.getKey()+" : "+entry.getValue());
                }

        }





    }


}
/*
Assignments:
	Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
 */