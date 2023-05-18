package day39_Recap.animal;

public class Zoo {
    public static void main(String[] args) {

        Bear bear = new Bear("Pole Bear", "Big", "White", 'M', 2, true, true, false);
        FriendlyAnimal friendlyAnimal = new FriendlyAnimal("Tropical Lovebird", "Small", "Yellow", 'M', 1, true, true, true);

        Dog dog=new Dog("Bulldog","Middle","Brown",'M',2,true,true,true);

        dog.eat();
        bear.eat();
        dog.play();
        dog.pet();
        bear.hunt();



    }
}
