package day44_Abstraction_Interface.carTask;

public class Toyota extends Car {
    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName() + " Twist the key to  ignition");
    }

    @Override
    public void drive() {

    }
}
