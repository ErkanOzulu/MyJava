package day24_CustomMethod_Return;

public class PT2_3_MaxMinNumber {
    public static void main(String[] args) {
        int[] num = {1, 5, 3, 4, 7, 8};
        int max=maxNumber(num);
        System.out.println("max number = " + max);

        int min=minNumber(num);
        System.out.println("min number= " + min);

    }
    //2. create a method that can return the maximum number from an array of integers
    public static int maxNumber(int[] num) {
        int max = 0;
        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    //3. create a method that can return the minimum number from an array of integers
    public static int minNumber(int[] num){
       int min=num[1];
        for (int each : num) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
}
