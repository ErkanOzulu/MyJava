package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {
String str="ccccddddddddddddaaaaaabbbbbbbb";
str=removeDuplicates(str);
        System.out.println(str);

    }

    //	1. create a method that can remove duplciated characters from a string and returns the new value

    public static String removeDuplicates(String str) { //"aaabbcccc" ===> "abc"

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }


}
