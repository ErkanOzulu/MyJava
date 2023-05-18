package day23_CustomMethods_Void;

public class T12_PositiveNegativeZero {
    public static void main(String[] args) {
       digitStatute(5);
    }

    public static void digitStatute(int number){
       String result="";
        if (number>0){
            result="Positive";
        } else if (number<0) {
            result="Negative";
        }else{
            result="Zero";
        }
        System.out.println(number+" is "+result);

    }


}
/*
12. create a method that can if the given integer is positive, negative or zero
 */