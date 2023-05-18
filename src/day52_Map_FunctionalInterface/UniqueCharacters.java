package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";
        String[] array = str.split("");
        Map<String, Integer> unique = new LinkedHashMap<>();

        for (String each : array) {

            int frequency = Collections.frequency(Arrays.asList(array), each);

            if (frequency==1){
                unique.put(each,frequency);
            }
        }
        System.out.println(unique);

    }

}

/*
1. Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}
 */

