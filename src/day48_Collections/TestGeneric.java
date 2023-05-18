package day48_Collections;

import day45_Abstraction.shape.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGeneric {
    public static void main(String[] args) {


        Integer[] numbers={1,2,3,4,5,6};
        Double[] decimals={1.5,2.5,3.5,4.5,5.5,6.5};
        String[] names={"Java","Selenium","SQL","API"};
        Shape[] shapes={null,null};


       // Generics.printEach(numbers);


        ArrayList<Integer>scores=new ArrayList(Arrays.asList(1.5,2.5,3.5,4.5,5.5,6.5));
       // Generics.printEach(scores);

        ArrayList<Double>scores2=new ArrayList(Arrays.asList(1,2,3,4,5,6));
     // Generics.printEach(scores2);


        Generics<Double>obj=new Generics<>();

        obj.printEach(decimals);
        obj.printEach(scores2);
    }

}
