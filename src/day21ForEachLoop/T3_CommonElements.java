package day21ForEachLoop;

public class T3_CommonElements {
    public static void main(String[] args) {

      int[] arr1={1,2,3,4,5};
      int[] arr2={4,5,6,7,8};
      String common="";
        for (int each : arr1) {
            for (int each2 : arr2) {
                if (each==each2){
                   common=" "+each;
                }
            }
            System.out.print(common);
        }


    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */