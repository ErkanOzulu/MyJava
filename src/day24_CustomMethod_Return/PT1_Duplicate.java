package day24_CustomMethod_Return;

public class PT1_Duplicate {
    public static void main(String[] args) {
        String str ="asdadasdaaaaccvv";
        str = duplicated(str);
        System.out.println(str);

    }


    public static String duplicated(String str) {
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
	/*
	1. create a method that can remove dupliciated characters from a string and returns the new value

	"aaabbcccc" ===> "abc"
	 */
