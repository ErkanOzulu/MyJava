package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer dev1=new Developer("Ahmet",35,'M',1,12000);
        Tester tester1=new Tester("Olga",23,'F',2,"SDET",110000);
        Teacher teacher1=new Teacher("Daniel", 32,'M',3,"Math Teacher",100000);
        Student student1=new Student("Ali",13,'M',1,"Math");

        System.out.println(dev1);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(student1);

        System.out.println("-----------------------------------");
        dev1.setAge(39);
        System.out.println(dev1.getAge());
        System.out.println(dev1);

        System.out.println("-------------------------------------");
        dev1.work();
        teacher1.work();
        tester1.work();

        System.out.println("--------------------------------------");


        dev1.eat();
        dev1.drink();
        dev1.sleep();

        dev1.fixingBug();

        System.out.println("---------------------------------------");

        tester1.eat();
        tester1.drink();
        tester1.sleep();





    }
}
