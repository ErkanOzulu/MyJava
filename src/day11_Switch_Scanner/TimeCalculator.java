package day11_Switch_Scanner;


import java.util.Scanner;

public class TimeCalculator {

    public static void main(String[] args) {

        Scanner time1 = new Scanner(System.in);

        System.out.println("Enter how many hours the video:");
        int hours = time1.nextInt();
        System.out.println("Enter how many minutes the video:");
        int minutes = time1.nextInt();
        System.out.println("Enter the video speed:");
        double videoSpeed = time1.nextDouble();
        double estimatedTime = ((hours*60)+minutes)/videoSpeed;
        double estimatedHours = (int) (estimatedTime / 60);
        double estimatedMinutes = (int)(estimatedTime%60);
        System.out.println("Your estimated time to finish the video is: " + estimatedHours + " hours " + estimatedMinutes + " minutes");
        System.out.println("when you watch the video with " + videoSpeed + "x speed");

        time1.close();

    }

}
//GUYS YOU CAN USE THIS WHEN YOU WANT TO LEARN HOW MUCH TIME THE VIDEOS WILL TAKE  :D