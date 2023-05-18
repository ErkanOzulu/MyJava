package day24_CustomMethod_Return;

public class T3_Reverse {
    public static void main(String[] args) {
        String word="Java";
        reverse(word);
    }

    public static String reverse(String str){
        String reverse="";

        for (int i =str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }
}
/**
 3. create a method named reverse that passes one string parameter, the method can return the reversed string

 Ex:
 str = "Java";

 reverse(str) ==> avaJ
 */
