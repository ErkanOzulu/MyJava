package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Husky", 'M', 2, "Small", "White");
        System.out.println(dog1);
        dog1.bark();
        //dog1.scratch();
        //dog1.sing;


        Cat cat1 = new Cat("Tarcin", "British", 'M', 3, "Small", "Brown");

        cat1.scratch();
        //cat1.bark();
        //cat1.sing();


        System.out.println(cat1);

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 4, "Large", "Blue");
        System.out.println(parrot1);


    }


}
