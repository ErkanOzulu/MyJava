package day06_PrimitiveTypeCastings;

import java.time.LocalDate;

public class HappyBirthDay {


    public static void main(String[] args) {


        happyBirthDay(1990, 9, 13);


    }



    public static void happyBirthDay(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            return;
        }
        System.out.println("Today is not your birthday yet");
    }


}


/*public class HappyBirthDay {

    public static void main(String[] args) {
        String name = "Aaron";
        int birthDay = 25;
        String month = "April";
        int birthYear = 1995;

        //John was born on month/day/year.
        System.out.println(name + " was born on " + month + "/" +birthDay +"/"+birthYear );

        System.out.println("-----------------------------------------------");

        // My favorite book is "bookName"
        String bookName = "The Rich Dad and The Poor Dad";

        System.out.println("My favorite book is " +  "\"" +bookName + "\"");
        /*
        \n
        \t
        \"
        \\
         */

        /*
        System.out.println(x);
        int x =200;
         */



/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)
			 use concatenation to display the birthday of the person
			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;
			 	output:
			 		John was born on April/25/1995.
 */