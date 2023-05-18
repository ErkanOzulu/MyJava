package day12_Scanner;

import java.util.Scanner;

public class ScannerHasNext {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");


        if (scanner.hasNextInt()) {

            int number = scanner.nextInt();
            System.out.println("number : " + number);
        } else {
            System.out.println("Invalid input");
        }
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();
// 13 34 32 if you add numbers with space and enter it also work
        System.out.println("age1 : " + age1 + " age2: " + age2 + " age3: " + age3 );

        int age = scanner.nextInt();
        scanner.nextLine(); // Dummy

        String name = scanner.nextLine();

        System.out.println("age: " + age);
        System.out.println("name: " + name);



    }

   
    
}
