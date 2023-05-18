package day20_Arrays;

import java.util.Arrays;

public class T2_Reverse {
    public static void main(String[] args) {
   String[] classmates={"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};




        for (int i = 0;  i< classmates.length; i++) {
            String each =classmates[i];
            String reverse="";
            for (int j= each.length()-1; j >= 0; j--) {
                reverse+=each.charAt(j);

            }
            System.out.println(reverse);
        }


        }

        }



/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */