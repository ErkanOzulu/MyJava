package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 2;  //1~12
        int year=2000;
        String result = "";


        if ((month >= 1 && month <= 12)) {
            switch (month) {
                case 2:
                    if (year%4==0){  // if we use ternaries ===> result=(year%4==0)?"29 days":"28days";
                        result="29 days";
                    }else {
                    result = "28 days";}
                    break;
                case 4:
                case 6:
                case 9:
                case 11:

                    result = "30 days";
                    break;

                default: // 1,3,5,7,8,10,12
                    result = "31 days";
            }
        } else
            result = "Invalid";

        System.out.println(result);


    }

}
/*

3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
			31 days: 1, 3, 5, 7, 8, 10, 12
			30 days: 4, 6, 9, 11
			28 days: 2
 */