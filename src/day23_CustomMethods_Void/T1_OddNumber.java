package day23_CustomMethods_Void;

public class T1_OddNumber {
    public static void main(String[] args) {
        oddNumber();
    }


    private static void oddNumber(){

        for (int i = 1; i <=100 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }


}












/*
	1. create a method that can print odd numbers between 1~100 in a same line saperated by space
 */