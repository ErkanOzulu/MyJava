package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P2T2_TipCalculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split = input.next().toLowerCase();
        System.out.println("Number of people ");
        int number= input.nextInt();
        System.out.println("Check amount: ");
        Double amount= input.nextDouble();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service=input.next();

        String result="";
        double totalTip=0;
      /*
        double tipRate = (service.equals("excellent"))? 0.25  :(service.equals("great"))? 0.2
                        :(service.equals("good"))? 0.15 :(service.equals("fair"))? 0.1 : 0.05;
       */

                if(service.equalsIgnoreCase("Poor")){
                    totalTip=amount*0.05;
                } else if (service.equalsIgnoreCase("Fair")){
                    totalTip=amount*0.1;
                } else if  (service.equalsIgnoreCase("Good")){
                    totalTip=amount*0.15;
                } else if  (service.equalsIgnoreCase("Great")){
                    totalTip=amount*0.20;
                } else {
                    totalTip=amount*0.25;

                }

                double totalPerPerson=amount/number;
                double tipPerPerson=totalTip/number;

                if (split.equals("yes")){
            result="Number of people entered: "+number+"\nTotal to pay:"+amount+"\nTotal tip: "+totalTip+"\nTotal per person: "+totalPerPerson
       +"\nTip per person: "+tipPerPerson;
        }

        System.out.println(result);


    }
}
/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method


 */