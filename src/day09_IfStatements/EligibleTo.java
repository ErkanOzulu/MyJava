package day09_IfStatements;

public class EligibleTo {

    public static void main(String[] args) {

        int age =19;
        String citizen ="USA";
        String eligible;

        if (age>=18){

            eligible = "eligible";
        }else{
             eligible="Not eligible.";
        }
        System.out.println(age+" years is "+eligible+" to buy alcohol.");

    if ((age>=18) && (citizen=="USA")){

        eligible="eligible to vote.";
    }else{
        eligible="not eligible to vote.";
    }

        System.out.println("Your age is "+age+" and you are "+citizen+" citizen.You are "+eligible);


    }
}
/*
	3. Write a program that can check if the person is eligible to buy alcohol
	4. Write a program that can check if the person is eligible to vote
 */