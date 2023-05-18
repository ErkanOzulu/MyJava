package day33_Statics;

public class Iphone {
    public static String brand="Apple";
    public String model;
    public double price;
    public static String OS="IOS";
    public String color;
    public String size;
    public static String madeIn="China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean hasFaceTime=true;


   // public static void printModelAndPrice(){
     //   System.out.println(model+" : "+price);
   // }
public void method1(){
    System.out.println(model+" : "+price);
    System.out.println(OS);
}


public  static  void printOperatingSystem(){
    System.out.println(OS);
}

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }


    public void faceTime(long phoneNumber){
        System.out.println(model + " is face timing with number " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model+" is face timing with email "+email);
    }
    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */