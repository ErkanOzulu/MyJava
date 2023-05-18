package day39_Recap.animal;

public class WildAnimal extends Animal{
    private boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name,"Wild Animal", size, color, gender, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public boolean isWild() {
        return isWild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void hunt(){
        System.out.println(getBreed()+" "+getName()+" is hunting.");
    }
}
/*
	3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()

 */