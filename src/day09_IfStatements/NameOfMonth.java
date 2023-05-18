package day09_IfStatements;

public class NameOfMonth {
    public static void main(String[] args) {

        int month=9; //1~12
        String name;

        if (month==1){
            name="January";

        } else if (month==2) {
            name="February";
        } else if (month==3) {
            name="March";
        } else if (month==4) {
            name="April";
        } else if (month==5) {
            name="May";
        } else if (month==6) {
            name="June";
        } else if (month==7) {
            name="July";
        } else if (month==8) {
            name="August";
        } else if (month==9) {
            name="September";
        } else if (month==10) {
            name="October";
        } else if (month==11) {
            name="November";
        }else{
            name="December";
        }

        System.out.println("This month is "+name);

    }
}
