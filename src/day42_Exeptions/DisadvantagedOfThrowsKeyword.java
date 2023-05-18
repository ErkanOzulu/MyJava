package day42_Exeptions;

public class DisadvantagedOfThrowsKeyword {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");


        sleep(2.5);//throws --->temporary fast  solution but not the best solution only use for checked exceptions

        System.out.println("Hello World");

        System.out.println("------------------------");
        System.out.println("Hello");


        MorningWorkOut.sleep(2.5);//try & catch ---> it needs more code block but permanent solution and best solution

        System.out.println("cydeo");
    }

    public static void sleep (double seconds) throws InterruptedException {


            Thread.sleep((long)(seconds*1000));

    }
}
