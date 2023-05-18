package day44_Abstraction_Interface.carTask;

public class Tesla extends Car implements AutoPilot{
    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }



    @Override
    public void autoPark() {
        System.out.println(getClass().getSimpleName()+" "+getModel()+" parks automatically ");
    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {
        System.out.println("Starts with voice command");
    }

    @Override
    public void drive() {

    }
}
