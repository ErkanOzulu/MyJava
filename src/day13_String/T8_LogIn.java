package day13_String;

import java.util.Scanner;

public class T8_LogIn {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username");
        String username1=scan.next();

        System.out.println("Enter password");
        String password1=scan.next();
scan.close();
String username= "Cydeo",
        password= "WoodenSpoon",

    result="";
if (username1.equals(username)&&password1.equals(password)){
    result="Logged in.";


}else
    result="Incorrect username or password";

    System.out.println(result);

    }
}
/*
8. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method

 */
