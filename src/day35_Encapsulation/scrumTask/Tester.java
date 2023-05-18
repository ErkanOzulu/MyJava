package day35_Encapsulation.scrumTask;

public class Tester {

private  String name;
    private   int employeeID;
   private String jobTitle;
    private   double salary;

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            return;
        }
        this.employeeID = employeeID;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if (salary<0){
            return;
        }
        this.salary = salary;
    }

    public Tester(String name, int employeeID, String jobTitle, double salary) {
       setName(name);
       setEmployeeID(employeeID);
        setJobTitle(jobTitle);
       setSalary(salary);
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
    public  void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


}
