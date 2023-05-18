package day44_Abstraction_Interface.deviceTask;

public abstract class Device{

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;


    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand.isBlank()|| brand.isEmpty()){
            throw new RuntimeException("It must not be null.");
        }
        this.brand = brand;
        if (model.isBlank()||model.isEmpty()){
            throw new RuntimeException("It must not be null.");
        }
        this.model = model;
        this.price = price;
        this.color = color;
        if (model.isEmpty()||model.isBlank()){
            throw new RuntimeException("It must not be null.");
        }
        this.size = size;
        this.hasBattery=hasBattery;
        this.hasPowerButton=hasPowerButton;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public abstract void  turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price ;
    }
}
/*
Device Task:
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price

 */