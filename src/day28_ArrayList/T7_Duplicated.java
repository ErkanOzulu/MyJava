package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class T7_Duplicated {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (Integer each : list) {
            int freq=Collections.frequency(list,each);
            if (freq>1){
                System.out.println(each);
                break;
            }
        }



    }
}
/*

7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */