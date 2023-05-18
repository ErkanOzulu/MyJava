package day39_Recap.animal;

public class Bear extends WildAnimal{
    public Bear(String name, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getBreed()+" "+getName()+" is hunting pig.");

    }
}
