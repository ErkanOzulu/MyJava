package day23_CustomMethods_Void;

public class T5_GradeOfStudent {
    public static void main(String[] args) {
        gradeOfStudent(95);
    }

    public static void gradeOfStudent(int score) {
        char result = ' ';
        if (score >=0 && score<= 100){
            if (score >= 90) {
                result = 'A';
            } else if (score >= 80) {
                result = 'B';

            } else if (score >= 70) {
                result = 'C';
            } else if (score >= 60) {
                result = 'D';
            } else {
                result = 'F';
            }
        }

        /*
         if(score >=0 && score<= 100){
            grade = (score >= 90)?"A" :(score >= 80)?"B" :(score >= 70)?"C" :(score >= 60)?"D" : "E";
        }
         */
        System.out.println("Your grade is :" + result);

    }

}




/*
5. create a method that can calculate the grade of the student based on the score
 */