package day33_Statics;

public class CydeoObject {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1=new CydeoStudent("Ahmet",32,'M',1234,'A',"E10",10);
        CydeoStudent cydeoStudent2=new CydeoStudent("Mehmet",49,'M',1234,'A',"E10",12);
        CydeoStudent cydeoStudent3=new CydeoStudent("Rıza",25,'M',1234,'A',"E10",8);

        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);

        cydeoStudent1.printSchoolName();
        cydeoStudent2.printProgLanguage();
        cydeoStudent1.attendClass();
        cydeoStudent2.attendClass();

        cydeoStudent1.study();
        cydeoStudent3.study();
    }
}
