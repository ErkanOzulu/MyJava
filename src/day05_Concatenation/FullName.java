package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName ="Abdullah";
        String secondName="Kul";
        int age=19;
        String jobTitle = "SDET";
        String companyName="Apple Inc.";
        double salary =100000.58;

        String fullName= firstName +" "+ secondName;

        //Full name of the person is ____

        System.out.println("Full name of the person is "+fullName);
        // ____is___years old.

        System.out.println("Full name of the person is "+fullName+" is "+age+" years old.");

        // FullName is jobTitle, works at companyName, and FullNAme' salary is Salary)
        System.out.println(fullName +" is "+jobTitle+", works at "+companyName
                +", and "+fullName+"'s salary is $"+ salary);

    }
}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address


 */