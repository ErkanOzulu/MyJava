package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";


        char thirdCharacter = word.charAt(2);

        System.out.println("thirdCharacter = " + thirdCharacter);

        /*char tenthCharacter=word.charAt(9);
        System.out.println("tenthCharacter = " + tenthCharacter);
        */
        System.out.println("=====================");


        String s1 = "Batch 25 is the batch.Java Programming Language";

        int totalCharacters = s1.length();

        System.out.println("totalCharacters = " + totalCharacters);

       char lastChar= s1.charAt(s1.length()-1); // last index number
        System.out.println("lastChar = " + lastChar);


        System.out.println("======================");

        String str="wooden spoon";
        str=str.toUpperCase(); //"WOODEN SPOON"
        System.out.println(str);

        // Today is a great day to learn java programming language.

        String sentence= "Today is a great day to learn java programming language.";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);



    }
}
