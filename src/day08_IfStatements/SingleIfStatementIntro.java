package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 300;
        boolean evenNumber = number%2==0;
        boolean oddNumber= !evenNumber;
        if (evenNumber){ // even number

            System.out.println(number +" is even number");
        }

        if(!evenNumber){ // not even number

            System.out.println("Odd Number");
        }


        System.out.println("----------------------");

        int n =200;
        // positive
        if(n>0){ // if the n greater than zero, then it's positive
            System.out.println(n+" is positive");
        }
        // negative

        if(n<0){
            System.out.println(n+"  is negative");

        }

        //ZERO
        if(n==0){
            System.out.println(n+" is zero.");
        }



    }
}
