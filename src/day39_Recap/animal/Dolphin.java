package day39_Recap.animal;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void swim(){
        System.out.println(getBreed()+" "+getName()+" is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating fish.");
    }
}


