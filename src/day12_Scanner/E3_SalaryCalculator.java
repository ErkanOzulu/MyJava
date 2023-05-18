package day12_Scanner;

import java.util.Scanner;

public class E3_SalaryCalculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);



        System.out.println("Enter your hourly rate : ");
        double hourlyRate= input.nextDouble();

        System.out.println("how many hours do you work in a week : ");
        int hoursInAWeek=input.nextInt();

        System.out.println("Enter state tax rate % : ");
        double stateTaxRate =input.nextDouble();

        System.out.println("Enter federal tax rate % : ");
        double federalTaxRate =input.nextDouble();


        double salary= hourlyRate*hoursInAWeek;

        double totalTaxRate= (stateTaxRate+federalTaxRate)/100;

        double federalTax = salary * federalTaxRate/100;
        double stateTax=salary*stateTaxRate/100;
        double totalTax= federalTax+stateTax;
        double netIncome=salary-totalTax;


        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);


        input.close();




    }
}
/*
 3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome


 */