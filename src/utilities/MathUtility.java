package utilities;

public class MathUtility {

    //Create a method that can return the sum of two integers
    public static int sum(int num1, int num2) {

        return num1 + num2;
    }

    //Create a method that can return the sum of two decimal numbers
    public static double sum(double num1, double num2) {

        return num1 + num2;
    }

    //Create a method that can return the subtraction of two integers
    public static int subtraction(int num1, int num2) {

        return num1 - num2;
    }

    //Create a method that can return the subtraction of two decimals
    public static double subtraction(double num1, double num2) {

        return num1 - num2;
    }

    //Create a method that can return the multiplication of two integers
    public static int multiplication(int num1, int num2) {

        return num1 * num2;
    }

    //Create a method that can return the multiplication of two decimals
    public static double multiplication(double num1, double num2) {

        return num1 * num2;
    }

    //Create a method that passes two double parameters and return the division result
    public static double division(double num1, double num2) {

        return num1 / num2;
    }

    //Create a method that can check if an integer is even number
    public static boolean even(int num) {

        boolean even = false;

        if (num % 2 == 0) {
            even = true;
        } else
            even = false;

        return even;
    }

    //Create a method that can check if an integer is odd number
    public static boolean odd(int num) {

        boolean odd = false;

        if (num % 2 != 0) {
            odd = true;
        } else
            odd = false;

        return odd;
    }

    //Create a method that can return the maximum number between two integers
    public static int maxNumber(int num1, int num2) {

        int result = 0;
        result = (num1 > num2) ? num1 : num2;

        return result;


    }

    //Create a method that can return the maximum number between two decimal numbers
    public static double maxNumber(double num1, double num2) {

        double result = 0;
        result = (num1 > num2) ? num1 : num2;

        return result;


    }

    //Create a method that can return the minimum number between two integers
    public static int minNumber(int num1, int num2) {

        int result = 0;
        result = (num1 < num2) ? num1 : num2;

        return result;


    }


    //Create a method that can return the minimum number between two decimal numbers
    public static double minNumber(double num1, double num2) {

        double result = 0;
        result = (num1 < num2) ? num1 : num2;

        return result;


    }

    //Create a method that can return the square of an integer
    public static int square(int num) {

       return (int)Math.pow(num,2); //The default value returns double

    }

    //Create a method that can return the square of a double
    public static double square(double num) {

        return Math.pow(num,2); //The default value returns double

    }


    //Create a method that can return the cube of an integer
    public static int cube(int num) {

        return (int)Math.pow(num,3); //The default value returns double

    }

    //Create a method that can return the cube of an double
    public static double cube(double num) {

        return Math.pow(num,3); //The default value returns double

    }
}
/*
1. Create a class called MathUtility under the utility package:

			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */