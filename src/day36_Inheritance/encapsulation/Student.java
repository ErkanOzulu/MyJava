package day36_Inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char grade, gender;
    private String schoolName;

    public static boolean isStudent=true;//static use because of common value for all the object
    public static boolean isHuman=true;
    public Student(String name, int age, char grade, char gender, String schoolName) {
        setName(name);
        setAge(age);
        setGrade(grade);
        setGender(gender);
        setSchoolName(schoolName);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age<5||age>90){
            return;
        }
        this.age=age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A' ||grade=='B' ||grade=='C' ||grade=='D' ||grade=='F' )){
            return;//exits the method
        }
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='F')){
            return;//exits the method
        }
        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", gender=" + gender +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
    public void study(){
        System.out.printf(name+" is studying");
    }
}
/*
armup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()

 */