package day24_CustomMethod_Return;

public class T4_Palindrome {
    public static void main(String[] args) {
        String example = "Level";
        isPalindrome(example);

    }


    //first way
    public static String isPalindrome(String word) {

        String str1 = "";
        String str2 = "";

        String result = "";

        for (int i = 0, j = word.length() - 1 - i; i < word.length() / 2; i++, j--) {
            str1 += word.charAt(i);
            str2 += word.charAt(j);
        }
        boolean isPalindrome=str1==str2;
        if (str1.equalsIgnoreCase(str2)) {
            result = "is Palindrome";
        } else {
            result = "is not Palindrome";
        }
        System.out.println(result);
        return result;
    }
        //second way
/**
    public static boolean isPalindrome(String word) {

        String str1 = "";
        String str2 = "";

        String result = "";



        for (int i = 0, j = word.length() - 1 - i; i < word.length() / 2; i++, j--) {
            str1 += ""+word.charAt(i);
            str2 += ""+word.charAt(j);
        }

        boolean isPalindrome=(str1.equalsIgnoreCase(str2));
        System.out.println(isPalindrome);
        return isPalindrome;
    }
*/
}


/**
 * 4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
 * <p>
 * Ex:
 * str = "Level"
 * <p>
 * isPalindrome(str) ===> true
 */