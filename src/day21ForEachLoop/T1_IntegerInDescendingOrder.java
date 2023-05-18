package day21ForEachLoop;

import java.util.Arrays;

public class T1_IntegerInDescendingOrder {
    public static void main(String[] args) {

        int[] numbers = {23, 45, 3, 7, 9, 12, 25, 9, 7, 6, 8};
        int[] result = new int[numbers.length];
        Arrays.sort(numbers);

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

            result[j]=numbers[i];
        }
        System.out.println(Arrays.toString(result));
    }


}

/*
	1. Write a program that sort the array of integer in descending order
 */