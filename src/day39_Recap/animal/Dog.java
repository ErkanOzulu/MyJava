package day39_Recap.animal;

public class Dog extends FriendlyAnimal {
    public Dog(String name, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void bark(){
        System.out.println(getBreed()+" "+getName()+" is barking ");
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating dog food.");
    }
}
