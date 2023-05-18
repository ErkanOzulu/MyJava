package day15_ForLoop;

public class traingle {

    public static void main(String[] args) {

        String star=" *";

        for (int i = 1; i < 6; i++) {
            System.out.println(star.repeat(i));
        }

String b=" *";
String c="  ";
String result1="";
String result="";
        for (int i = 5; i >=0 ; i--) {
            result1=c.repeat(i);

            result=b.repeat(5-i);

            System.out.println(result1+result);

            }
            }



    }
