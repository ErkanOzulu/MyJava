package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T5_FindMax {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int max=Collections.max(list);
        System.out.println(max);
        System.out.println(list.indexOf(5));

        /*
         int max = list.get(0);

        for (Integer each : list) {
            if(each > max){
                max = each;
            }

         */

    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */