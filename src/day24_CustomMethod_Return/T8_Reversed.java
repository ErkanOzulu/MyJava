package day24_CustomMethod_Return;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T8_Reversed {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        reverse(arr);
    }

    public static int[] reverse(int[] arr) {

        int reverse[] = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));
        return reverse;
    }
}
/**
 * 8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
 * <p>
 * Ex:
 * arr = {10, 20, 30, 40};
 * <p>
 * reverse(arr) ==> {40, 30, 20, 10}
 */