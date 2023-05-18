package day25_CustomMethods_Overloading;

public class T2_MaxNumber {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7,8,9};

        int maxNumber=maxNumber(array);

        System.out.println("maxNumber = " + maxNumber);

    }

    private static int maxNumber(int[] arr) {

        int max=arr[0];
        for (int each : arr) {
            if (each>max)
                max=each;
        }

       return max;
    }
    private static double maxNumber(double[] arr) {

        double max=arr[0];
        for (double each : arr) {
            if (each>max)
                max=each;
        }

        return max;
    }
    private static long maxNumber(long[] arr) {

        long max=arr[0];
        for (long each : arr) {
            if (each>max)
                max=each;
        }

        return max;
    }
    private static short maxNumber(short[] arr) {

        short max=arr[0];
        for (short each : arr) {
            if (each>max)
                max=each;
        }

        return max;
    }
    private static float maxNumber(float[] arr) {

        float max=arr[0];
        for (float each : arr) {
            if (each>max)
                max=each;
        }

        return max;
    }
    private static byte maxNumber(byte[] arr) {

        byte max=arr[0];
        for (byte each : arr) {
            if (each>max)
                max=each;
        }

        return max;
    }
}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */