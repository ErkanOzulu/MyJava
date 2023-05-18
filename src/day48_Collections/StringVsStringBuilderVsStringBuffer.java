package day48_Collections;

public class StringVsStringBuilderVsStringBuffer {

    public static void main(String[] args) {

        String str="Wooden";// String literal, immutable and stored the string pool
        String str1=new String("Wooden"); //By new keyword, immutable

        str.concat("Spoon");// if you want to concat you must reassign
        System.out.println(str);

        StringBuilder stringBuilder=new StringBuilder("Wooden"); //By new keyword,Mutable, can be modified.It is not synchronized, not thread-safe
        stringBuilder.append(" Spoon");
        System.out.println(stringBuilder);


        StringBuffer stringBuffer=new StringBuffer("Wooden");//By new keyword,Mutable, can be modified.It is synchronized and thread-safe
        stringBuffer.append(" Spoon");
        System.out.println(stringBuffer);



    }

}
