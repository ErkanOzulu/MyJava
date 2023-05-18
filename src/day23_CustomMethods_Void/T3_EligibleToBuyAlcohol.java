package day23_CustomMethods_Void;

public class T3_EligibleToBuyAlcohol {
    public static void main(String[] args) {
        eligibleToBuyAlcohol(19);
    }

    public static void eligibleToBuyAlcohol(int age){

        if (age>=18){
            System.out.println("Eligible to buy alcohol.");
        }else {
            System.out.println("Not eligible to buy alcohol.");
        }
    }

}


/*
3. create a method that can check if a person is eligible to buy alcohol
 */