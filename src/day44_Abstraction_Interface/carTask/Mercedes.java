package day44_Abstraction_Interface.carTask;

public class Mercedes extends Car implements AutoPark{
    public Mercedes( String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
