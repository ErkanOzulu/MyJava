package day36_Inheritance.employeeTask;

public class WorkSociety {
    public static void main(String[] args) {

        Developer developer=new Developer();
        developer.setInfo("Ahmet","Cydeo","Developer",'M',35,1234,135000);

        System.out.println(developer);
        developer.work();
        developer.develop();

        Tester tester=new Tester();
        tester.setInfo("Mehmet","Cydeo","Tester",'M',40,12323,130000);

        System.out.println(tester);
        tester.work();
        tester.test();


        Driver driver=new Driver();
        driver.setInfo("Murat","CTransport","Driver",'M',30,234234,135000);

        System.out.println(driver);
        driver.work();
        driver.drive();


        Teacher teacher=new Teacher();
        teacher.setInfo("Serpil","Cydeo","Mentor",'F',35,11111,140000);

        System.out.println(teacher);
        teacher.work();
        teacher.teach();



    }
}
