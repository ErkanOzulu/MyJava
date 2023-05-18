package day24_CustomMethod_Return;

import java.util.Arrays;

public class PT4_ReversedArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] reversed=reversed(num);
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] reversed(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; j++, i--) {
            reversed[j] = arr[i];
        }
        return reversed;
    }

}
//4. create a method that return the reversed array
//					{1,2,3,4,5} === > {5,4,3,2,1}