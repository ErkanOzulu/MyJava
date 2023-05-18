package day23_CustomMethods_Void;

public class CustomMethodPractice {
    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("----------------------------------");
        helloCydeo5Times();
        System.out.println("----------------------------------");
        evenNumbers();
    }


    //create a function that can hello world 5 times===>helloWorld5Times()
    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }


    }


    //create a function that print hello Cydeo 5 times ==> helloCydeo5Times

    public static void helloCydeo5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    // create a function  that can print all the even numbers from 1~10 ==>evenNumbers

    public static void evenNumbers(){
        for (int i =1; i <=10 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
           /* for (int j = 2; j <11 ; j+=2) {
                System.out.print(j+" ");
            }

            */

    }



}
