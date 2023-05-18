package day11_Switch_Scanner;

public class numberToWords {

    public static void main(String[] args) {

        int num = 7;
        String result = (num >= 0 && num <= 9) ? (num == 0) ? "Zero" : (num == 1) ? "One" : (num == 2) ? "Two"
                : (num == 3) ? "Three" : (num == 4) ? "Four" : (num == 5) ? "Five" : (num == 6) ? "Six" : (num == 7) ? "Seven" : (num == 8) ? "Eight" : "Nine"
                : "Invalid Number";
        System.out.println(result);


        int number = 9;

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;


            default:
                System.out.println("Invalid");

        }









        }
}
/*
2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary

 */