package day36_Inheritance.phone;

public class Iphone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" "+" is having a Face Time with phone number: "+phoneNumber);
    }
    public void faceTime(String email){

        System.out.println(brand+" "+model+" "+" is having a Face Time with email: "+email);
    }

}
/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */
