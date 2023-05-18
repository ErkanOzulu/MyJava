package day24_CustomMethod_Return;

import java.util.Arrays;

public class PT5_Merge {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5};
        int[] returnj = merge(arr1, arr2);
        System.out.println(Arrays.toString(returnj));
    }

    //first way
    /**

    public static int[] merge(int arr1[], int arr2[]) {

        int merge[] = new int[arr1.length + arr2.length];

        for (int i = 0; i <arr1.length; i++) {
            merge[i] = arr1[i];
        }
        for (int i = arr1.length, j=0; i < merge.length ; i++,j++) {
            merge[i]=arr2[j];
        }
        return merge;
    }

     */

    //second way
    public static int[] merge(int[]a,int[]b){
        int[] merge=new int[a.length+b.length];
        int count=0;
        for (int i = 0; i <a.length ; i++) {
            merge[i]=a[i];
            count++;
        }
        for (int i = 0; i <b.length ; i++) {
            merge[count++]=b[i];
        }
        return merge;
    }
}


/*
5. create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}

 */