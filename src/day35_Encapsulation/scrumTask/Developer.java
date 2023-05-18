package day35_Encapsulation.scrumTask;

public class Developer {
    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

        if (employeeID <= 0) {
            return;
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            return;
        }
        this.salary = salary;
    }

    public Developer(String name) {
        setName(name);

    }

    public Developer(String name, int employeeID) {
        this(name);
        setEmployeeID(employeeID);

    }

    public Developer(String name, int employeeID, String jobTitle) {
        this(name, employeeID);
        setJobTitle(jobTitle);
    }

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this(name, employeeID, jobTitle);
        setSalary(salary);
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding() {

        System.out.println(name + " is coding");
    }

    public void unitTesting() {
        System.out.println(name + " is unit testing");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug");
    }

}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */