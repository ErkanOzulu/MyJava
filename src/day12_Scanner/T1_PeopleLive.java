package day12_Scanner;

import java.util.Scanner;

public class T1_PeopleLive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("How many people do you live with :");
        int num = input.nextInt();
        String result = "";
        if (num == 2 || num == 1 || num == 0) {
            result = "They live with less than 3 people";


        } else if (num >= 3 && num <= 6) {
            result = "They live with 3 - 6 people";

        } else {
            result = "They live with more than 6 people";
        }
        System.out.println(result);

    }
}
/*

1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */