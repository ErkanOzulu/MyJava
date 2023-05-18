package day09_IfStatements;

import java.util.SortedMap;

public class MaxOrMinNumber {
    public static void main(String[] args) {

        int n1=10, n2=20;
        boolean n1Max= n1>n2;
        boolean n2Max= n2>n1;

        if (n1Max) {
            System.out.println(n1+" is maximum number between two different numbers");
        }else {
            System.out.println(n2+" is maximum number between two different numbers");
        }
        if (!n1Max){
            System.out.println(n1+" is minumum number between two different numbers");
        }else{
            System.out.println(n2+" is minumum number between two different numbers");
        }

    }
}
/*

task:
		1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a progrm that can check if the person is eligible to buy alcohol
		4. Write a progrm that can check if the person is eligible to vote

 */