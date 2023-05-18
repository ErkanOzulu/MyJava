package day24_CustomMethod_Return;

import java.util.Arrays;

public class T10_RemoveElement {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;
        removeElement(array, index);

    }

    public static int[] removeElement(int[] arr, int index) {

        int[] result = new int[arr.length - 1];


        for (int i = 0, j = 0; i < arr.length; i++, j++) {

            if ((i == index)) {
                j--;
                continue;
            }else {

                result[j]=arr[i];
            }

        }
        System.out.println(Arrays.toString(result));
        return result;

    }


}


/**
 * 10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
 * Ex:
 * array = {10, 20, 30, 40, 50, 60}
 * index = 2
 * <p>
 * <p>
 * removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */