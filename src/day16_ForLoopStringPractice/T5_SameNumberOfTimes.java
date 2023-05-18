package day16_ForLoopStringPractice;

public class T5_SameNumberOfTimes {
    public static void main(String[] args) {

        String  sentence = "caT dog dogG cAt";

        int numCat=0;
        int numDog=0;

        for (int i = 0; i <=sentence.length()-3 ; i++) {

            String sub=sentence.substring(i,i+3);
            if (sub.equalsIgnoreCase("cat")){
                numCat++;
            }
            if (sub.equalsIgnoreCase("dog")){
                numDog++;
            }

        }
        System.out.println(numCat==numDog);

    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */