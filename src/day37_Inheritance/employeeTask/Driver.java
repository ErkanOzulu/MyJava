package day37_Inheritance.employeeTask;

public class Driver extends Employee{
    public Driver(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void driving(){
        System.out.println(getJobTitle()+" "+getName()+" is driving");
    }
}
