package day44_Abstraction_Interface.carTask;

public class CarShop {
    public static void main(String[] args) {


        Audi audi=new Audi("A3",2020,12000,"White");
        Toyota toyota=new Toyota("Corolla",2021,13000,"Black" );
        Tesla tesla=new Tesla("Model1",2022,13000,"Yellow");
        Mercedes mercedes=new Mercedes("Amg",2021,15000,"Black");
        Honda honda=new Honda("Civic",2021,12000,"White");

        System.out.println(honda);
        System.out.println(tesla.hasAutoPark);
        tesla.autoPark();
        System.out.println(toyota);
        System.out.println(tesla);
        System.out.println(mercedes);



    }
}
