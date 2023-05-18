package day39_Recap.cydeoTask;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Developer", salary);
    }

    public void fixingBug() {
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing application.");
    }
}
/*
  4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()

 */