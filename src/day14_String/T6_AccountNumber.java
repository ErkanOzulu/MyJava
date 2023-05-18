package day14_String;

import java.util.Scanner;

public class T6_AccountNumber {
    public static void main(String[] args) {
        System.out.println("Please enter an account number");
        String accountNumber = new Scanner(System.in).nextLine();
        String result = "";

        if (accountNumber.startsWith("2") && accountNumber.length() == 7) {
            result = "Valid";
        } else if (accountNumber.startsWith("5")&&accountNumber.length() == 10) {
            result = "Valid";
        } else
            result = "Invalid account number";

        System.out.println(result);

}
}
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */