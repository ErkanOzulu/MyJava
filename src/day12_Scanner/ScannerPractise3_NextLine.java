package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3_NextLine {
    public static void main(String[] args) {

        //  123Enter

        Scanner input=new Scanner(System.in);


        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();

        System.out.println("Enter your Programming Language:");
        String programming=input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();//24
        input.nextLine(); // Capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name");
        String schoolName=input.nextLine();//Enter


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("schoolName = " + schoolName);
        System.out.println("age = " + age);
        input.close();
    }
}
