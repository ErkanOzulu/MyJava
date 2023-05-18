package day44_Abstraction_Interface.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {

        if (make.equals(null)|| make.isEmpty()){
            throw new RuntimeException("Make can not be null or empty");
        }
        this.make = make;
        if (model.equals(null)||model.isEmpty()){
            throw new RuntimeException("Model can not be null or empty");
        }
        this.model = model;
        if (year<1886){
            throw new RuntimeException("Invalid year");
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid year");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color.equals(null)||color.isEmpty()){
            throw new RuntimeException("Color can not be null or empty");
        }
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(getClass().getSimpleName() + " stops when you press the brake.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{'"  +
                " model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
