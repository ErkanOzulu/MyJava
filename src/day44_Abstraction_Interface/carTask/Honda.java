package day44_Abstraction_Interface.carTask;

public class Honda extends Car{
    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");

    }

    @Override
    public void drive() {

    }
}
