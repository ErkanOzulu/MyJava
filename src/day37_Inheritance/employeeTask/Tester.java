package day37_Inheritance.employeeTask;

public class Tester extends Employee{

    public Tester(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void testing(){
        System.out.println(getJobTitle()+" "+getName()+ " is testing.");
    }
    public void creatingTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket." );
    }


}
