package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class T1_Insert {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        char [] ch={'a','b','c','d','e'};
        int a=100;
        int result[]=insert(arr, 3,a);
        char result2[]=insert(ch,2,'g');
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));

    }

    public static int[] insert(int[] array, int index, int a) {

        int [] r1=new int[index];
        int[] result=new int[array.length+1];

        for (int i = 0; i <index ; i++) {
            r1[i]=array[i];
        }
        r1=ArraysUtility.addElement(r1,a);

        result=Arrays.copyOf(r1,array.length+1);
        for (int i =index+1; i <array.length+1 ; i++) {
            result[i]=array[i-1];
        }
        return result;

        /*
         public static int[] insert(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length + 1];
        result[index] = newElement;
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j] = array[i];

        }

        return result;
    }

         */
    }

    public static double[] insert(double[] array, int index, double a) {

        double [] r1=new double[index];
        double[] result=new double[array.length+1];

        for (int i = 0; i <index ; i++) {
            r1[i]=array[i];
        }
        r1=ArraysUtility.addElement(r1,a);

        result=Arrays.copyOf(r1,array.length+1);
        for (int i =index+1; i <array.length+1 ; i++) {
            result[i]=array[i-1];
        }
        return result;
    }

    public static char[] insert(char[] array, int index, char a) {

        char [] r1=new char[index];
        char[] result=new char[array.length+1];

        for (int i = 0; i <index ; i++) {
            r1[i]=array[i];
        }
        r1=ArraysUtility.addElement(r1, a);

        result=Arrays.copyOf(r1,array.length+1);
        for (int i =index+1; i <array.length+1 ; i++) {
            result[i]=array[i-1];
        }
        return result;
    }

    public static String[] insert(String[] array, int index, String a) {

        String [] r1=new String[index];
        String[] result=new String[array.length+1];

        for (int i = 0; i <index ; i++) {
            r1[i]=array[i];
        }
        r1=ArraysUtility.addElement(r1,a);

        result=Arrays.copyOf(r1,array.length+1);
        for (int i =index+1; i <array.length+1 ; i++) {
            result[i]=array[i-1];
        }
        return result;
    }
}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */