package day18_NestedLoop;

import java.util.Scanner;

public class T2_RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        while (true) {

            System.out.println("Which bedroom do you want to reserve?\n" +
                    "Options: King Bed   ==> $120\nQueen Bed  ==> $100\nSingle Bed ==> $80");

            String bed = scan.nextLine().toLowerCase();

            while (!(bed.equals("king bed") || bed.equals("queen bed") || bed.equals("single bed"))) {
                System.err.println("Invalid entry, Which bedroom do you want to reserve?");
                bed = scan.nextLine().toLowerCase();
            }

            System.out.println("How many nights are you staying");
            int nights = scan.nextInt();


                if (bed.equals("king bed")) {
                    result += (120*nights);
                } else if (bed.equals("queen bed")) {
                    result += (100*nights);
                } else
                    result += (80*nights);


            System.out.println("Would you like to reserve another room?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry, would you like to reserve another room?(yes/no)");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no"))
                break;
            scan.nextLine();
        }
        System.out.println("Total price is: "+result+"$");

    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
