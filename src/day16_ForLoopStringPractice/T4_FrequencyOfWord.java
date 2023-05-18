package day16_ForLoopStringPractice;

public class T4_FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java";

        int frequency = 0;

        for (int i = 0; i <= sentence.length() - 4; i++) {
         String eachSub=sentence.substring(i,i+4);

            if (eachSub.equals("Java")){
                frequency++;
            }

        }
        System.out.println(frequency);
    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */