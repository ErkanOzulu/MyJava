package day37_Inheritance.sportsTask;

import java.util.SplittableRandom;

public class Sport {
    private String name, rules;
    private int numberOfPlayers, numberOfReferre;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferre) {
        setName(name);
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferre(numberOfReferre);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setNumberOfReferre(int numberOfReferre) {
        this.numberOfReferre = numberOfReferre;
    }

    public String getName() {
        return name;
    }

    public String getRules() {
        return rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getNumberOfReferre() {
        return numberOfReferre;
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                '}';
    }
}
