package day33_Statics.car;

public class Car {
    public String make, model, color;
    public int year;
    public double price;

    public static int numberOfWheels = 4;
    public static boolean hasBattery = true, hasSeats = true;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void drive(){
        System.out.println("Driving "+make+" "+model);
    }



    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
