package day36_Inheritance.bookTask;


public class AudioBook extends Book{


    private double length;
    private String narrator;
    public void setInfo(String title, String type, String author, double price, double length, String narrator) {
        setInfo(title,type,author,price);
        setLength(length);
        setNarrator(narrator);
    }


    public double getLength() {
        return length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    public void listen(){
        System.out.println("Listening to "+getTitle());
    }
}
