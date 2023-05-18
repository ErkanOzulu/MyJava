package day15_ForLoop;

public class Shape {
    public static void main(String[] args) {

String  star="* ";

        for (int i = 0; i <8 ; i++) {


            System.out.println(star.repeat(6));

        }

        for (int i = 1; i < 6; i++) {
            System.out.println("* ".repeat(i));
        }

    }
}
/*
	1. print the following shape:

				* * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */