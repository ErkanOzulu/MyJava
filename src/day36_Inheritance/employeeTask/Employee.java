package day36_Inheritance.employeeTask;

public class Employee {

    public String name, companyName, jobTitle;
    public char gender;
    public int age, id;
    public double salary;

    public void setInfo(String name, String companyName, String jobTitle, char gender, int age, int id, double salary) {
        this.name = name;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+" is working.");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
Employee:
		name, gender, age, jobTitle, id, salary, companyName
		setInfo(), work(), toString()


	Tester

	Developer

	Driver

	Teacher
 */