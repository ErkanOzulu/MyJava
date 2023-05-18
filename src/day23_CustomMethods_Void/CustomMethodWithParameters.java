package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {
        oddOrEven(10); // the method demands additional info to complete its task
        ageOfPerson(1995);
printNumbers(1,10);

    }





    // create a function that can check if a number is odd number or even number

    public static void oddOrEven(int number){// 10

        if (number%2==0){
            System.out.println(number+ " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

    }


    // create a function that can display the age of person

    public static void ageOfPerson(int birthYear){

        int age= 2022-birthYear;
        System.out.println("Your age is: "+age);
    }



    // create a function that can print all the numbers between X and Y

    public static void printNumbers(int x, int y){

        for (int i = x; i <= y; i++) {
            System.out.print(i+" ");
        }
    }



}
