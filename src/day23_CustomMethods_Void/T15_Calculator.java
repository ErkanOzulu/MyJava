package day23_CustomMethods_Void;

public class T15_Calculator {
    public static void main(String[] args) {
        calculator(3,4,'+');
    }

    public static void calculator(int num1, int num2, char mathOperator ){


        if(mathOperator =='*'){
            System.out.println(num1*num2);
        } else if (mathOperator=='+') {
            System.out.println(num1+num2);
        } else if (mathOperator=='-') {
            System.out.println(num1-num2);
        } else if (mathOperator=='/') {
            System.out.println(num1/num2);
        }

    }


}
/*
15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
 */