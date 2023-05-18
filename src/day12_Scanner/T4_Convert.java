package day12_Scanner;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class T4_Convert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter miles: ");
        double miles = scan.nextDouble();
        double km=miles*1.609344;

        System.out.println(miles+" miles equal to "+String.format("%.2f",km)+" kilometers");


    }

}
/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */