package day13_String;

public class T3_Compare {
    public static void main(String[] args) {

String a="respect", result="";

char firstChar=a.charAt(0);
char lastChar=a.charAt(a.length()-1);

        if (firstChar==lastChar){

            result="The first and last characters of the string are same";
        }else

            result="The first and last characters of the string are not same";

        System.out.println(result);


    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */