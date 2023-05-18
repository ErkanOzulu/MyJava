package day27_WrapperClasses;

public class T3_Retrive {
    public static void main(String[] args) {

        String str = "Wooden Spoon!123";
        retrive(str);
        
        

    }

    private static void retrive(String str) {

        char[] ch=str.toCharArray();
        String letters="";
        String digits="";
        String specialChar="";

        for (char each : ch) {
            if (Character.isLetter(each)){
                letters+=each;
            } else if (Character.isDigit(each)) {
                digits+=each;
            }else
                specialChar+=each;
        }


        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);


    }


}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

 */