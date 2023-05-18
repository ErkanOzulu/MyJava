package day37_Inheritance.employeeTask;

public class Developer extends Employee {

    public Developer(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void coding(){
        System.out.println(getJobTitle()+" "+getName()+" is coding");
    }
   public void fixingBugs(){
       System.out.println(getJobTitle()+" "+getName()+" is fixing bug");
   }

}
