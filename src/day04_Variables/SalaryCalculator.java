package day04_Variables;

public class SalaryCalculator {

    //hourlyRate; weeklyHours
    public static void main(String[] args) {

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        //System.out.println(salary);

        System.out.println("weeklyHours = " + weeklyHours);  // soutv shortcut
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("salary = $" + salary);

    }

}
