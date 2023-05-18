package day33_Statics;

public class TestIphone {
    public static void main(String[] args) {

        Iphone phone1=new Iphone("Iphone 13",750.5,"White","5.6 ,inches");

        System.out.println(phone1);
        System.out.println(Iphone.OS);
        phone1.faceTime(1234567);
        phone1.faceTime("adsf@asdk.com");

        phone1.call(12342313);
        phone1.text(1234567);



    }

}
