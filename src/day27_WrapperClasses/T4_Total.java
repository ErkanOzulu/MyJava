package day27_WrapperClasses;

public class T4_Total {
    public static void main(String[] args) {

        String str = "JAVA java";

        int count1 = 0;
        int count2 = 0;
        char[] ch = str.toCharArray();
        for (char each : ch) {
            if (Character.isUpperCase(each)) {
                count1++;
            } else if (Character.isLowerCase(each)) {
                count2++;
            }


        }


        boolean result = count1 == count2;
        System.out.println("result = " + result);



/*
String str = "JAVA java";
        int countLowerCase = 0;
        int countUpperCase = 0;
        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            }

        }
        boolean result = countLowerCase == countUpperCase;
        System.out.println(result);


    }
 */

    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */