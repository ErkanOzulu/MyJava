package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {


    public static void main(String[] args) throws RuntimeException {

        System.out.println("Test1 started");


        try {
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }

        System.out.println("Test1 Completed");

        System.out.println("------------------------------");

        System.out.println("Test2 started");



        int[] numbers={1,2,3,4,5};

       try{
           System.out.println(numbers[200]);
           System.out.println("Try Block");
       }catch (RuntimeException e){
           System.out.println("Catch Block");
           System.out.println("Runtime exception was occurred");
            e.printStackTrace();//get where the exception occur and gives full detail
           System.out.println(e.getMessage());//get what exception is,  shows full  detail.(Index 200 out of bounds for length 5)

       }

        System.out.println("Test2  completed");

        System.out.println("-----------------------------------");

        System.out.println("Test3 started");

        try{
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 completed");


        System.out.println("-----------------------------------");
        System.out.println("Hello");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();//throw new RuntimeException(e);
        }

        System.out.println("Cydeo");

        System.out.println("-----------------------------------");

        try {
            FileInputStream file=new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();//    throw new RuntimeException(e);
        }
        System.out.println("checked exception");


    }
}
