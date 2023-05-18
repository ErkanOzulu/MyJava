package day23_CustomMethods_Void;

public class T14_PrintEachElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        eachElement(arr); // eachElement(new int[]{1,2,3});

    }

    public static void eachElement(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}
/*
14. create a method named printEachElement that can print each elements of an integer array
 */