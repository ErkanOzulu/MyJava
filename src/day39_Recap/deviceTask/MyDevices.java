package day39_Recap.deviceTask;

public class MyDevices {
    public static void main(String[] args) {


        BlackBerry blackBerry=new BlackBerry("MyPhone","C21","Black","Middle",1000);

        blackBerry.call(123123);
        blackBerry.text(123123);
        blackBerry.turnOff();
        blackBerry.turnOn();


    }
}
