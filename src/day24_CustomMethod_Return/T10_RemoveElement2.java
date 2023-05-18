package day24_CustomMethod_Return;

import java.util.Arrays;

public class T10_RemoveElement2 {
    public static void main(String[] args) {
        int []arr={12,13,14,15,16};
        int elementToBeRemoved= 4;
        remove(arr,elementToBeRemoved);

    }
    public static void  remove( int [] arr, int indexToBeRemoved){
        int []arr2= new int[arr.length-1]; // create a new array that has one less number than first array
        /// index is the number of index to be removed
        for (int i = 0,j=0; i <arr.length ; i++) { // there isn't j++

            if (i!=indexToBeRemoved){// do not add element when the index number equal to indexToBeRemoved
                arr2[j]=arr[i];
                j++; // if you put this in the for it does not work.

            }

        }
        System.out.println(Arrays.toString(arr2));
    }
}

