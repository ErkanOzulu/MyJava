package day39_Recap.animal;



import javax.lang.model.element.Name;

public class FriendlyAnimal extends Animal {

    private boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String size, String color, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, "Friendly Animal", size, color, gender, age);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
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

    public void play(){
        System.out.println(getBreed()+" "+getName()+" is playing.");
    }
    public void pet(){
        System.out.println(getBreed()+" "+getName()+" is a pet.");
    }
}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */