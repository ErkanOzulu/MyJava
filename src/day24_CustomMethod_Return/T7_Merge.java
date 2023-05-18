package day24_CustomMethod_Return;

import java.util.Arrays;

public class T7_Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
merge(arr1,arr2);
    }

    public static int[] merge(int[] a, int[] b) {

        int[] merge = new int[a.length + b.length];
        int count=0;
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
            count++;
        }
        for (int i = 0; i < b.length ; i++) {
            merge[count++]=b[i];
        }
        /*
        second way
        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
         */
        System.out.println(Arrays.toString(merge));
        return merge;
    }
}
/**
 * 7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array
 * <p>
 * Ex:
 * arr1 = {1,2,3}
 * arr2 = {4,5,6}
 * <p>
 * merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */