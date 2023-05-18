package day19_LoopPractices;

import java.util.Scanner;

public class PT4_GradeCalculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String result="";
        while (true){
        System.out.println("Enter your score");
        int s=scan.nextInt();
        if (!(s>0&&s<=100)){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        if (s>=90){
            result="A";
        } else if (s>=80) {
            result="B";
        }else if (s>=70) {
            result="C";
        }else if (s>=60) {
            result="D";
        }else  {
            result="F";
        }
            System.out.println(result);

        System.out.println(" Would you like to continue?");
        String ans=scan.next().toLowerCase();
        if (!(ans.equals("yes")||ans.equals("no"))) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        if (ans.equals("no")){
            System.out.println("Thank you for using Cydeo Grade Calculator APP");
        System.exit(0);
        }

    }

    }
}
/*
4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


 */