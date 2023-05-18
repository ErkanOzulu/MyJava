package day52_Map_FunctionalInterface;

import java.util.*;

public class T2_Frequency {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("java", "java", "python", " c#"));

        Map<String, Integer> map=new LinkedHashMap<>();

        int max=Integer.MIN_VALUE;

        for (String each : list) {
            int frequency= Collections.frequency(list,each);
            map.put(each,frequency);
            if (frequency> max){
                max=frequency;
            }
        }

        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max){
                System.out.println("Element " + entry.getKey() + " has highest frequency of " + entry.getValue());
            }
        }

    }
}
/*
Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency

 */