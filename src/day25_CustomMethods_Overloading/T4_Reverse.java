package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class T4_Reverse {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] intReversed = reverse(intArray);
        System.out.println(Arrays.toString(intReversed));
        System.out.println("----------------------------");


        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        double[] doubleReversed=reverse(doubleArray);
        System.out.println(Arrays.toString(doubleReversed));
        System.out.println("----------------------------");

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        char[] charReversed=reverse(charArray);
        System.out.println(Arrays.toString(charReversed));
        System.out.println("----------------------------");

        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"};
        String[] stringReversed=reverse(names);
        System.out.println(Arrays.toString(stringReversed));






    }

    private static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        return reversed;
    }

    private static double[] reverse(double[] arr) {

        double[] reversed = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }

        return reversed;
    }

    private static char[] reverse(char[] arr) {

        char[] reversed = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }

        return reversed;
    }

    private static String[] reverse(String[] arr) {

        String[] reversed = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }

        return reversed;
    }
}


/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */