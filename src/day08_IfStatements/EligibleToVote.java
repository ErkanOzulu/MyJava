package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name ="Josh";
        int age=38;
        String citizen="USA";
        boolean isEligible = age>=21 && citizen=="USA";

        // Eligible

        if(isEligible){
            System.out.println("Eligible");

        }
        // not eligible
        if(!isEligible){   // !True===> not true ===>false
            System.out.println("Not Eligible");
        }

    }


}
