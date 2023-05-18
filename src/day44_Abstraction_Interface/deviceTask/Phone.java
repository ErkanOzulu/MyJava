package day44_Abstraction_Interface.deviceTask;

public abstract class Phone extends Device {


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+getModel()+" is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+getModel()+" is turning off.");
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber +"is calling");
    }
    public  void  text(long phoneNumber){
        System.out.println(phoneNumber+" is texting");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                ", color" +getColor()+
                ", size" +getSize()+
                ", hasBattery"+isHasBattery()+
                ", hasPowerButton"+isHasPowerButton()+
                "}";
    }
}
