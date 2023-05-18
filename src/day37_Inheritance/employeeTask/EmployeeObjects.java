package day37_Inheritance.employeeTask;


public class EmployeeObjects {
    public static void main(String[] args) {
        Developer developer = new Developer("Ahmet", "Developer", 'M', 35, 1234, 135000);
        System.out.println(developer);
        developer.work();
        developer.coding();
        developer.fixingBugs();

        Tester tester = new Tester("Mehmet", "Tester", 'M', 40, 12323, 130000);
        System.out.println(tester);
        tester.work();
        tester.testing();
        tester.creatingTicket();

        Driver driver = new Driver("Murat", "Driver", 'M', 30, 234234, 135000);
        System.out.println(driver);
        driver.work();
        driver.driving();

        Teacher teacher = new Teacher("Serpil", "Mentor", 'F', 35, 11111, 140000);

        System.out.println(teacher);
        teacher.work();
        teacher.teaching();


    }
}
