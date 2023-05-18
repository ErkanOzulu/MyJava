package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));


        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.set(0,2); //like replace
        System.out.println(numbers);

        numbers.add(3,9);
        numbers.addAll(Arrays.asList(10,11,12));
        Collections.addAll(numbers,13,14,15);
        System.out.println(numbers);


        numbers.remove(2);
        System.out.println(numbers);

        System.out.println(Collections.frequency(numbers, 2));

        numbers.remove((Integer)2); //remove element
        System.out.println(numbers);

        Collections.addAll(numbers,1,1,1,2,2,2,3,3,3,4);
        System.out.println(numbers);
        numbers.removeAll(Arrays.asList(1,2,3));
        System.out.println(numbers);

        numbers.removeIf(p-> p>10);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);


        System.out.println("-------------------------");


        ArrayList<Integer>list=new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size= list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize=list.size();

        int totalNumberOfZeros=size-newSize;

        for (int i = 0; i <totalNumberOfZeros ; i++) {
            list.add(0);
        }

        System.out.println(list);

        System.out.println("--------------------------------");

        ArrayList<Integer>list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result=new ArrayList<>();

        for (Integer each : list2) {
            if (each!=0){
                result.add(each);
            }
        }
        System.out.println(result);

        for (Integer each : list2) {
            if (each==0){
                result.add(each);
            }
        }
        System.out.println(result);

        ArrayList<Integer>list3=new ArrayList<>();
        Collections.addAll(list3,0,0,0,0,1,1,1,1,2,2,2,3,3,4);
        System.out.println(list3);

        list3.removeAll(Arrays.asList(0,1,2,3));
        System.out.println(list3);

        Collections.addAll(list3,0,0,0,1,1,1,2,2,2,3);
        System.out.println(list3);

        System.out.println("-------------------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars=new ArrayList<>();


        for (char each : str.toCharArray()) {
          chars.add(each);
        }
        System.out.println(chars);
      /*  for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        } */



        ArrayList<Character> letters=new ArrayList<>(chars); // add all characters
        letters.removeIf(p-> !Character.isLetter(p)); //remove the characters that are not letters

        System.out.println("letters = " + letters);

        ArrayList<Character> digits=new ArrayList<>(chars);// add all characters
        digits.removeIf(p-> !Character.isDigit(p)); //remove the characters that are not digits

        System.out.println("digits = " + digits);


        ArrayList<Character> specialChar=new ArrayList<>(chars);

        //specialChar.removeAll(letters);
        //specialChar.removeAll(digits);

        specialChar.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("specialChar = " + specialChar);






    }
}
/*
	1. write a program that can swap the first and last elements of an ArrayList

	2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]

    3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"

				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}



 */