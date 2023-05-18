package day33_Statics.dog;

public class Test {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy", "Husky", "Small", 'F',4, "White" );

        System.out.println(dog1);
        dog1.eat();
        dog1.play();
        dog1.sleep();


    }

}
