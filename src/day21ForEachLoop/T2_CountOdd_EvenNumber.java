package day21ForEachLoop;

public class T2_CountOdd_EvenNumber {
    public static void main(String[] args) {

int[] numbers={1,2,3,4,5,6,7,8,9,10};
String even="";
String odd="";
        for (int each : numbers) {
            if (each%2==0){
                even+=" "+each;
            }else
                odd+=" "+each;
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);

    }
}
/*

	2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */