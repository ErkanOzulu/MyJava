package day42_Exeptions;

public class MorningWorkOut {
    public static void main(String[] args)  {
        System.out.println("-------------Push up started-----------");



        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPush up"+i);// it allows to repeatedly print on the same line  owing to \r


            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

             */
            sleep(1.5);

        }


        System.out.println("-------------Push up completed-----------");

        System.out.println("-------------Pull up started-----------");



        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPul lup"+i);// it allows to repeatedly print on the same line  owing to \r

            sleep(2.5);

        }
        System.out.println("-------------Pull up completed-----------");
    }
    public static void sleep (double seconds){

        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
