package day10_NestedIf;

public class T1_GradeLevel {

    public static void main(String[] args) {

        byte number = 19;
        String gradeLevel = "";

        if (number >=1 && number <=18){
            gradeLevel =(number >= 17)? "Grad School" :(number >= 13)?  "College"
                    :(number >= 9)?"High School" :(number >= 6)?"Middle School":"Elementary School";
        }else{
            gradeLevel = "Invalid grade level";
        }
        System.out.println(gradeLevel);

    }
}