package day22MultiDimensionalArray;

import java.util.Arrays;

public class T1_AlternativeReverseImportant {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        int[][] reversed = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            int index = array.length - i - 1;             // 3, 2, 1, 0
            reversed[i] = new int[array[index].length];   // 6, 5, 4, 3

            for (int j = 0; j < array[index].length; j++) {
                reversed[i][j] = array[index][array[index].length - j - 1];
            }

        }
        System.out.println(Arrays.deepToString(reversed));
    }
}
