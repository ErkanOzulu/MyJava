package day24_CustomMethod_Return;

import java.util.Arrays;

public class T1_FrequencyOfWord {
    public static void main(String[] args) {
        String str = "Java java java python python";
        String word = "java";
        int result=frequencyOfWord(str,word);

        System.out.println("result = " + result);
    }

    public static int frequencyOfWord(String sentence, String word) {

        String arr[] = sentence.split(" ");
        int count = 0;
        System.out.println(Arrays.toString(arr));
        for (String each : arr) {

            if (each.equalsIgnoreCase(word)){
                count++;
            }

        }
        return count;
    }


}
/**
 * 1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
 * Ex:
 * sentence = "Java java java python python"
 * word = "java";
 * frequencyOfWord(sentence, word) ==>  3
 */