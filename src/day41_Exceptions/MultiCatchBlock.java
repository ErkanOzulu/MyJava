package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlock {
    public static void main(String[] args) {

        Employee employee = null;


        try {

            System.out.println(employee.getSalary());//.NullPointerException
        } catch (IndexOutOfBoundsException e) {

            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {

            System.out.println("second catch block");
            e.printStackTrace();

        } catch (ClassCastException e) {

            System.out.println("Third catch block");
            e.printStackTrace();

        } catch (RuntimeException e) {

            System.out.println("Fourth catch block");
            e.printStackTrace();
        }



        System.out.println("Tested Completed");

        System.out.println("-----------------------------------------------");

        try{
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}
