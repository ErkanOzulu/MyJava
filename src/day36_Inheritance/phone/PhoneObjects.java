package day36_Inheritance.phone;

public class PhoneObjects {
    public static void main(String[] args) {


        Nokia nokia=new Nokia();
        nokia.setInfo("S34","13''","white",13000);
        Samsung samsung=new Samsung();
        samsung.setInfo("S21","10.s inch","Black",1200);
        Iphone iphone=new Iphone();
        iphone.setInfo("13","10.3 inch","White",1000);


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }

}
