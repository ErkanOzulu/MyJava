package day17_While_DoWhile;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.StringTokenizer;

public class T6_InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your gender");
        String gender = scan.next().toLowerCase();
        while (!(gender.equals("female") || gender.equals("male"))) {
            System.out.println("Please enter your gender(Female/Male)");
            gender = scan.next().toLowerCase();
        }
        System.out.println("Are you married");
        String married = scan.next().toLowerCase();
        while (!(married.equals("yes") || married.equals("no"))) {
            System.out.println("Are you married(Yes/No)");
            married = scan.next().toLowerCase();
        }
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        while (age < 0 || age >= 120) {
            System.out.println("Please re-enter valid age(0~120)");
            age = scan.nextInt();
        }
        System.out.println("how many miles do you drive in a day");
        int miles = scan.nextInt();
        while (miles < 0 || miles < 5) {
            System.out.println("Please re-enter valid miles (m>=5)");
            miles = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Do you want to full coverage or liability insurance");
        String cover = scan.nextLine().toLowerCase();
        System.out.println("Did you have any accidents or claims in past 5 years(yes/no)");
        String accident = scan.next().toLowerCase();
        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.out.println("Please enter \"yes\" or  \"no\"");
            accident = scan.next().toLowerCase();
        }
        System.out.println("Does your car has any anti-theft device?");
        String device = scan.next().toLowerCase();
        while (!(device.equals("yes") || device.equals("no"))) {
            System.out.println("Please enter \"yes\" or  \"no\"");
            device = scan.next().toLowerCase();
        }
        double result = 0;
        int a = 0;
        int b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double g = 0;
        if (cover.contains("liability")) {

            a = (age < 25) ? 90 : 50;
            b = (miles <= 10) ? 10 : (miles > 10 && miles <= 50) ? 30 : 50;

        } else if (cover.contains("full coverage")) {

            a = (age < 25) ? 160 : 120;
            b = (miles <= 10) ? 20 : (miles > 10 && miles <= 50) ? 40 : 70;
        }
        result = a + b;

        if (device.equals("yes")) {
            c = result * 0.05;    //If the car has anti-theft device ==> 5% discount
        }
        if (accident.equals("yes")) {
            d = result * 0.15; //If he/she had any accidents or claims in past 5 years ===> 15% extra charge
        } else
            g = result * 0.1; // If he/she never had any accidents or claims in past 5 years ==> 10% discount

        if (married.equals("yes")) {
            e = result * 0.05; // If he/she is married ==> 5% discount
        }
        System.out.println("Name : " + name);
        System.out.println("Gender:  " + gender);
        System.out.println("Age : " + age);
        System.out.println("Married Statues: " + married);
        System.out.println("Insurance type: " + cover);
        System.out.println("Price = " + result);
        System.out.println("Total discount : " + (d - c - g - e));
        System.out.println("Total price : " + (result = a + b + (d - c - g - e)));


    }

}

/*
 6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


 */