package day32_Constructors;

public class Employee {
    public String name, jobTitle;
    public char gender;
    public double salary;


    public Employee(String name) {
        this.name = name;
    }




    public Employee(String name, char gender) {

        this.name=name;  //this(name);
        this.gender = gender;
        //Employee(name); constructor  calling different other methods

    }

    public Employee(String name,  char gender,String jobTitle) {
        this(name,gender);//this.name = name;
        //this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public Employee(String name,  char gender,String jobTitle, double salary) {
       this(name, gender, jobTitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }





}
/*
this: refers to the instances

	this. : to call instance variables & instance methods
	this() : used for calling the constructors


Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or conatin itself


 */