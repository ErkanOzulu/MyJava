package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list1.get(0));


        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list2.get(0));


        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3.get(0));


        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list4.get(0));

        System.out.println("-------------------------------------------------------");

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);
    }

      /*
    From Collection back to array
String[] arr = {"Wooden Spoon", "Eggs", "Coke", "Paper towels"};
arr = new LinkedHashSet<>( Arrays.asList(arr) ).toArray(new String[0]);

From one type of Collection to the other one
ArrayList<Integer> list = new ArrayList<>();
list = new ArrayList<>(  new LinkedHashSet<>(list)  );
     */
}

