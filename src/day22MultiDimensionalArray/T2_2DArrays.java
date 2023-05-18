package day22MultiDimensionalArray;

public class T2_2DArrays {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        System.out.println("- 1. print the following output: (add \\t between two words)-");
        for (String[] arr1D : items) {
            for (String element : arr1D) {
                System.out.print(element+"\t");
            }
            System.out.println();
        }
        System.out.println("-2.print the following output: (add \\t between two words)-");

        for (String[] arr1D : items) {
            for (int i = arr1D.length - 1; i >= 0; i--) {
                System.out.print(arr1D[i]+"\t");
            }
            System.out.println();
        }
        System.out.println("-3.print the following output: (add \\t between two words)-");
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j <items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};
		 1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */