package day20_Arrays;

public class T1_ClassMates {
    public static void main(String[] args) {
        String[] classmates={"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna", "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        String initials="";

        for (int i = 0; i < classmates.length; i++) {
           String each=classmates[i];
           initials= each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
        }



    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
            */
