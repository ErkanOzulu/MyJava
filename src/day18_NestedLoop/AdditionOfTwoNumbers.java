package day18_NestedLoop;
import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while (true){
            System.out.println("Please enter first number");
            int num1=scan.nextInt();
            System.out.println("Please enter second number");
            int num2=scan.nextInt();

            System.out.println("Addition: "+(num1+num2));
            System.out.println("Would you like to continue");
            String ans=scan.next().toLowerCase();

            while (!(ans.equals("yes")|| ans.equals("no"))){ // if the answer invalid
                System.out.println("Invalid entry.Please re enter.");
                ans=scan.next().toLowerCase();
            }
            if (ans.equals("no"))
                break; //exits the outer loop

        }



    }


}