package day44_Abstraction_Interface.carTask;

public class BMW extends Car{


    public BMW( String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    @Override
    public void drive() {

    }
}
