package day37_Inheritance.phoneTask;

public final class Nokia extends Phone {
    public Nokia(String model, String size, String color, double price) {
        super("Nokie", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println("you can use"+brand+" "+model+" has self defense tool");
    }
}
/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */