package day17_While_DoWhile;

import java.util.Scanner;
import java.util.SortedMap;

public class T5_RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do yo want to reserve a room?");
        String wants = scan.next().toLowerCase();
        String result = "";


        while (!(wants.equals("no") || wants.equals("yes"))) {
            System.out.println("re-enter valid option(Yes or No) ");
            wants = scan.next().toLowerCase();
        }

        scan.nextLine(); // its place very important

        if (wants.equals("yes")) {
            System.out.println("Which types of room do you want?");
            String typeOfRoom = scan.nextLine();

            while (!(typeOfRoom.equalsIgnoreCase("King Bed") || typeOfRoom.equalsIgnoreCase("Queen Bed") || typeOfRoom.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Please re-enter room option");
                typeOfRoom = scan.nextLine().toLowerCase();
            }

            if (typeOfRoom.equalsIgnoreCase("King Bed")) {
                result = "King Bed : 120$";

            } else if (typeOfRoom.equalsIgnoreCase("Queen Bed")) {

                result = "Queen Bed : 100$";

            } else if (typeOfRoom.equalsIgnoreCase("Single Bed")) {

                result = "Single Bed : 80$";
            }


        } else if ((wants.equals("no"))) {
            System.out.println("Have a nice day");
        }
        System.out.println(result);

    }

}

/*
 5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */