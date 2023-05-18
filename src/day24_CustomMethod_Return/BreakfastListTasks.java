package day24_CustomMethod_Return;

public class BreakfastListTasks {
    public static void main(String[] args) {

        initial("Ahmet", "Orhan");

        System.out.println("-------------------------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String each : emails) {
            domain(each);
        }

        domain("Cydeo.School@amazon.com");

        System.out.println("-------------------------------------------");

        nameOfMonth(2);

        System.out.println("-------------------------------------------");

        nameOfDay(2);

        System.out.println("-------------------------------------------");
        daysInMonth(12);
    }


    public static void initial(String firstName, String lastName) {
        //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println(initial.toUpperCase());
    }

    public static void domain(String email) {
        //2. Create a method that can display the domain of the email.  domain(String email)
        String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    public static void nameOfMonth(int number) {
        //3. Create a method that can display the name of the month based on the given number to the method
        String name = "";
        if (number > 0 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "Agust" : (number == 9) ? "Sept" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }


    public static void nameOfDay(int number) {
        //4. Create a method that can print the name of the day based on the given number to the method

        String day = "";

        if (number > 0 && number <= 7) {
            day = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";

        } else {
            day = "Invalid";
        }
        System.out.println("Day name : " + day);

    }


    public static void daysInMonth(int number) {
        //5. Create a method that can print how many days a month has
        /*
        28 ==feb
        30 ==april, june , sep, nov
        31 ==jan, mar, may, july, agu,oct,dec
         */
        if (number == 4 || number == 6 || number == 9 || number == 11) {
            System.out.println(number+".month"+" is 30 days.");
        } else if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
            System.out.println(number+".month"+" is 31 days.");
        }else {
            System.out.println(number+".month"+" is 28 days.");
        }

    }
}