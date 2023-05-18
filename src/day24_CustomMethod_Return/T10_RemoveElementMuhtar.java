package day24_CustomMethod_Return;

import java.util.Arrays;

public class T10_RemoveElementMuhtar {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;
        removeElement(array, index);
    }

    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


}