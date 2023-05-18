package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T4_ReverseIntegers {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5}; //elements in ordinary sequence

        int[] reverse=new int[array.length]; // we should use this variable to hold the reversed elements

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reverse[j]=array[i];// this assigns the elements from last to first
        }
        System.out.println(Arrays.toString(reverse));// this prints elements in reversed sequence



    }
}
/*

	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */