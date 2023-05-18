package day22MultiDimensionalArray;

import java.util.Arrays;

public class T1_Mine {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        int[][] reversed = new int[array.length][];

        for (int i = 1; i <= array.length; i++) {
            int a= array.length - i;  // stands for index number
            reversed[i-1] = new int[array[a].length]; // reversed[0/1/2/3]

            for (int j = 1; j <= array[a].length; j++) {
                reversed[i-1][j-1] = array[a][array[a].length - j];
            }

        }
        System.out.println(Arrays.deepToString(reversed));
    }
}
