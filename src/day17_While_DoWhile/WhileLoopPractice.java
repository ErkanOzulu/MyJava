package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //username: "Cydeo"

        // password: "Cydeo123"

//while(invalid && hasAttempts)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();
        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("logged in");
        } else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                if (attempts==1){
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username: ");
                u = scan.next();
                System.out.println("Enter your password: ");
                p = scan.next();
                attempts--;
            }


        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("logged in");
        } else {

            System.out.println("Your accoun is locked.");
        }
        }
        scan.close();


    }
}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */