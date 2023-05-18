package day21ForEachLoop;

public class T4_CountPalindromes {
    public static void main(String[] args) {

        String[] str1={"anna", "level", "Java"};

        int count=0;
        for (String each : str1) {
            String str2="";
            for (int i = each.length()-1; i >=0 ; i--) {
                str2+=each.charAt(i);
            }
               if (str2.equals(each)){
                   count++;
               }


        }

        System.out.println(count);

    }
}
/*
 4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */