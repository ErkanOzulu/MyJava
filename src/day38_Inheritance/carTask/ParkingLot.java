package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry",2020,20000,"Gray",11223);
        Tesla tesla=new Tesla("Model S",2010,10000,"white",1000);

        BMW bmw=new BMW("X5",2020,30000,"black",12000);


        toyota.start();
        tesla.start();
        bmw.start();

    }

}
