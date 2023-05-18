package day12_Scanner;

import java.util.Scanner;

public class T2_SpeedLimit {
    public static void main(String[] args) {

        int speedLimit=90;
        String result="";
        Scanner input=new Scanner(System.in);

        System.out.println("Enter current speed: ");

        int speed=input.nextInt();

        if (speed>speedLimit){
            int surplus = speed - speedLimit;
            result="You're driving "+surplus+" mph over the limit. Slow down! ";
        }else {

        }
        System.out.println(result);
    }
}
/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned,
ask user to enter the current speed,
if the current speed is over the speedLimit print slow down,
otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */