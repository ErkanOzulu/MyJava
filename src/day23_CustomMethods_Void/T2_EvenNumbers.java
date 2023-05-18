package day23_CustomMethods_Void;

public class T2_EvenNumbers {
    public static void main(String[] args) {
        evenNumbers();

    }
    public static void evenNumbers(){

        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }

}




/*
2. create a method that can print even numbers between 1~100 in a same line saperated by space
 */