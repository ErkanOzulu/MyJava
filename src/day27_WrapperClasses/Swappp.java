package day27_WrapperClasses;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Swappp {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

     int[] arr={1,2,3,4,5,6};

       arr=swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] swap(int[] arr, int i, int j) {

       int a=arr[i];
       arr[i]=arr[j];
       arr[j]=a;
       return arr;

    }


}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array

 */