package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class T1_Merge {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] arr1 = merge(array1, array2);

        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------------------------");
        double[] array3 = {1, 2, 3, 4, 5};
        double[] array4 = {6, 7, 8, 9, 10};
        double[] arr2 = merge(array3, array4);

        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------------------");
        char[] array5 = {'1', '2', '3','4','5' };
        char[] array6 = {'6', '7', '8', '9', 'a'};
        char[] arr3=merge(array5,array6);
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------------");
        String[] array7 = {"Ebubekir","Ömer","Osman","Ali","Sad"};
        String[] array8 = {"Übeyde","Abdurrahnan","Talha","Zübeyir","Said",};
        String[] arr4=merge(array7,array8);

        System.out.println(Arrays.toString(arr4));

    }

    private static int[] merge(int[] arr1, int arr2[]) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    private static double[] merge(double[] arr1, double arr2[]) {

        double[] result = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    private static char[] merge(char[] arr1, char arr2[]) {

        char[] result = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    private static String[] merge(String[] arr1, String arr2[]) {

        String[] result = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }

}


/*
Task1:
	1. create a method that can merge two integer arrays.  		

	2. create a method that can merge two double arrays.  	

	3. create a method that can merge two char arrays.   		

	4. create a method that can merge two String arrays.  		

 */