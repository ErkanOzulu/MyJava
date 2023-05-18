package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0]='A';
        letters[1]='B';
*/


        for (char i = 'A', j = 0; i <= 'Z'&& j < letters.length ; i++, j++) {// i: index numbers 0~last index

            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters)); // [A~Z


        System.out.println("______________Other Way1____________________");

        for (int i = 0, j='A'; i < letters.length ; i++, j++) {
            letters[i]=(char)j;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("______________Other Way____________________");

        char ch='A';
        for (int i = 0; i < letters.length ; i++) {
            letters[i]=ch++;// letters[i]=ch
            //ch++
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("_______________________________");

        char[] letters2 = new char[26];
        for (int i = letters2.length-1, j='Z'; i >=0 ;j--, i--) {
           letters2[i]=(char)j;
        }
        System.out.println(Arrays.toString(letters2));
    }
}
