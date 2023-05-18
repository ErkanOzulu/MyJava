package day37_Inheritance.phoneTask;

public class Phone {  // parent class:only contains the common features of all the sub-class
    public String brand, model, size, color;
    public double price;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+"is calling"+phoneNumber);
    }


   public void text(long phoneNumber){
       System.out.println(brand+" "+model+" is texting"+phoneNumber);
          }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", has battery= " + hasBattery +
                '}';
    }
}
/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
					Add Constructor for set all fields


				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */