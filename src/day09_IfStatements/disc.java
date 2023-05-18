package day09_IfStatements;

public class disc {
    public static void main(String[] args) {


        char c;

        System.out.println(3 + 5);
        System.out.println('a' + "" + 'b');


        int plan = 1;
        plan = plan++ + --plan;
        if (plan == 1) {
            System.out.println("Plan A");
        } else if (plan == 2)
            System.out.println("Plan B");
        else
            System.out.println("Plan C");



        int yt=1;
        yt--;
        System.out.println(yt);



    }
}


