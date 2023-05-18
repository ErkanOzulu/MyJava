package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int m=9; //1~12
       String name= (m==1)?"January":(m==2)?"February":(m==3)?"March":(m==4)?"April":(m==5)?"May":(m==6)?"June":(m==7)?"July"
    :(m==8)?"August":(m==9)?"September":(m==10)?"October":(m==11)?"November":"December";
         /* parentheses  are optional and total number of question mark
         must be equal total number of colon in ternaries.
          */
        System.out.println(name);
    }
}


