package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("Iphone 12","6.7 inches","Black" ,1000);
        Samsung samsung=new Samsung("galaxy s19","6 inches","White",900);
        Nokia nokia=new Nokia("Brick","4 inches","Gray",50);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(1234567);
        iphone.faceTime(23456789);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("------------------------------------------");

        samsung.call(911);
        samsung.text(21345678);
        samsung.freeze();

        System.out.println("------------------------------------------");

        nokia.call(98765432);
        nokia.text(43655476);
        nokia.selfDefense();

        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Phone.hasBattery);
        System.out.println(Nokia.hasBattery);





    }
}
