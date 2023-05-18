package day39_Recap.animal;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, size, color, gender, age, isWild, isFriendly, isPlayable);
    }
public void fly(){
    System.out.println(getBreed()+" "+getName()+" is flying.");
}
public void sing(){
    System.out.println(getBreed()+" "+getName()+" is singing");
}

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating bird seed.");
    }
}

