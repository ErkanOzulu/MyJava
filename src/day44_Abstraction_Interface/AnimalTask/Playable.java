package day44_Abstraction_Interface.AnimalTask;

public interface Playable {

boolean isFriendly=true; //static & final by default
    // public access modifier by default

       /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    void play();//abstract by default

    //initializing means initials any variable or reference name
    //instantiating means create any object

}
