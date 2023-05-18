package day24_CustomMethod_Return;

import java.util.Arrays;

public class T6_AddElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int num = 4;
        addElement(arr, num);
    }

    public static int[] addElement(int[] arr, int a) {

        int newArray[] = new int[arr.length + 1];

        newArray[newArray.length - 1] = a;

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
/**
 * 6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array
 * <p>
 * Ex:
 * arr ={1,2,3};
 * num = 4;
 * <p>
 * addElement(arr, num) ==> {1,2,3,4}
 */