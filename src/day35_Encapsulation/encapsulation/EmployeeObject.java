package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Tatiana",'F',28,11000);
        Employee employee2=new Employee("",'G',10,-2000);
        System.out.println(employee2);

        employee1.setAge(32);
        System.out.println(employee1);
        Employee employee3=new Employee("Aygun",'F',31,115000);
        employee3.setName("Elvira");
        employee3.setSalary(employee3.getSalary()+15000);
        System.out.println(employee3);





    }
}
