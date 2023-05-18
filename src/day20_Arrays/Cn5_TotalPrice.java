package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Cn5_TotalPrice {
    public static void main(String[] args) {

        String[]  items=new String[5];
        double[] prices=new double[5];
        double total=0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < items.length; i++) {
            System.out.println("Please enter item's name");
            String itemName=scan.next();
            items[i]=itemName;

            System.out.println("Please enter item's price");
            Double price1=scan.nextDouble();
            prices[i]=price1;
            total+=prices[i];

        }
        for (int i = 0; i <items.length ; i++) {
            System.out.println(items[i]+"\t-- "+prices[i]);
        }


        System.out.println("Total price = " + total);


    }
}
/*
	5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price

 */