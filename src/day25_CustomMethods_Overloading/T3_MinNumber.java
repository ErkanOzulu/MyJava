package day25_CustomMethods_Overloading;

public class T3_MinNumber {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7,8,9};

        int minNumber=minNumber(array);

        System.out.println("minNumber = " + minNumber);

    }

    private static int minNumber(int[] arr) {

        int min=arr[0];
        for (int each : arr) {
            if (each<min)
                min=each;
        }

        return min;
    }
    private static double minNumber(double[] arr) {

        double min=arr[0];
        for (double each : arr) {
            if (each<min)
                min=each;
        }

        return min;
    }
    private static long minNumber(long[] arr) {

        long min=arr[0];
        for (long each : arr) {
            if (each<min)
                min=each;
        }

        return min;
    }
    private static short minNumber(short[] arr) {

        short min=arr[0];
        for (short each : arr) {
            if (each<min)
                min=each;
        }

        return min;
    }
    private static float minNumber(float[] arr) {

        float min=arr[0];
        for (float each : arr) {
            if (each<min)
                min=each;
        }

        return min;
    }
    private static byte minNumber(byte[] arr) {

        byte min=arr[0];
        for (byte each : arr) {
            if (each<min)
                min=each;
        }

        return min;
    }
}
/*
Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array
 */