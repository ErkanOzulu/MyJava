package day39_Recap.animal;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getBreed()+" "+getName()+" is scratching.");
    }
    public void meow(){
        System.out.println(getBreed()+" "+getName()+" is  meowing.");
    }

    @Override
    public void eat() {
        System.out.printf(getBreed()+" "+getName()+" is eating cat food.");
    }
}
