package day20_Arrays;

import java.util.Arrays;

public class T4_Scores {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};

        char [] grades = new char[names.length];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90){
                grades[i]='A';
            } else if (scores[i] >= 80) {
                grades[i]='B';
            } else if (scores[i] >= 70) {
                grades[i]='C';
            }
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
        }

/*
  String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length]; // this means length is 3

        grades[0] = 'A'; // because I know the scores, I assigned them one by one
        grades[1] = 'C';
        grades[2] = 'B';

        for (int i = 0; i < names.length; i++) { // this executes the code 3 times

            System.out.println(names[i] + "'s score is " + scores[i]+ ", and grade is " + grades[i]); // this prints the report

        }
 */
    }
}
/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */