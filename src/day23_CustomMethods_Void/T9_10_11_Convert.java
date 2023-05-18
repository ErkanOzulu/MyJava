package day23_CustomMethods_Void;

public class T9_10_11_Convert {
    public static void main(String[] args) {

        convertDollarToEuro(2);
        System.out.println("");
        convertDollarToLira(3);
        convertKgToLb(5);
    }

    public static void convertDollarToEuro(double dollar) {
        double euro = dollar * 1.01;
        System.out.println(dollar + "$ is  " + euro + "€");
    }

    public static void convertDollarToLira(double dollar) {
        double lira = dollar * 18.6;
        System.out.println(dollar + "$ is  " + String.format("%.2f", lira) + "TL");

    }

    public static void convertKgToLb(double kg) {
        double lb = kg * 2.2046;
        System.out.println(kg + "kg is " + String.format("%.4f", lb) + "Libre");
    }
}


/*
9. create a method that can convert dollar to euro
10. create a method that can can convert dollar to lira
11. create a method that can convert kg to lb
 */