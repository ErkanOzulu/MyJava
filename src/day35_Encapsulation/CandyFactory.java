package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1=new Candy("jelibon",2,12,false);
        Candy candy2=new Candy("withMilk",3,13,true);
        Candy candy3=new Candy("withCofee",5,15,false);
        Candy candy4=new Candy("hard",4,10,true);
        Candy candy5=new Candy("soft",1,11,false);


        ArrayList<Candy>candies=new ArrayList<>();
        candies.addAll(Arrays.asList(candy1,candy2, candy3,candy4,candy5));

        for (Candy candy : candies) {
            System.out.println(candy.getBrand());
            System.out.println(candy.getPrice());
        }


    }




}
/*
.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */