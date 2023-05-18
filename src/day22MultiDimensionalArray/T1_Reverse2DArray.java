package day22MultiDimensionalArray;

import day13_String.Reverse;

import java.sql.Array;
import java.util.Arrays;

public class T1_Reverse2DArray {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        int[][] reversed = new int[array.length][];// int[][] reverse = new int[2][]

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = new int[array[i].length];//reversed[j] = array[i];

            for (int k = array[i].length - 1, m = 0; k >= 0; k--, m++) {
                reversed[j][m] = array[i][k];
                //       0   0          1 2

            }

        }System.out.println(Arrays.deepToString(reversed));
    }
}





/*
  int [] [] array2D = { {1,2,3}, {4,5,6} };

      int [][] reversed = new int[2][];

        for (int i = array2D.length-1, j=0; i >= 0 ; i--, j++) {
          reversed[j] = array2D[i]; // reverse[j] = new int[array2D[i].length];

            for (int k = array2D[i].length-1, m=0; k >= 0 ; k--, m++) {
                reversed[j][m] = array2D[i][k];
            }

            }
        System.out.println(Arrays.deepToString(reversed));
Hey guys, could someone tell me please why my result is [[6, 5, 6], [3, 2, 3]] not [[6, 5, 4], [3, 2, 1]]?
 */

/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */