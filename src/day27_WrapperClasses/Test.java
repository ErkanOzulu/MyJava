package day27_WrapperClasses;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        //index num    0, 1, 2, 3, 4, 5
        int[] array = {4, 9, 1, 3, 6, 4};


        int sumLeft = 0;
        int sumRight = 0;

    //           index1         index4
        for (int i = 1; i < array.length - 1; i++) {
            sumLeft = 0;
            sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft += array[j]; //4,13,16

            }
            for (int k = array.length - 1; k > i; k--) {
                sumRight += array[k];
            }

            if (sumLeft == sumRight)
                System.out.println(i);



        }
    }
}





/*
Question: **FindTheBalanceItemIndex**

   //Given an array of integers, write a program that prints the index of an item in the array, where the sum of all items on its left is equal to the sum of the ones on the right.

   For example :
       Given array => [4, 9, 1, 3, 6, 4]
   //Output:
       your program should print as a result => 2
       because the item at index 2 is 1, and 4+9 = 3+6+4
 */