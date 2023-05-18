package day05_Concatenation;

import java.sql.SQLOutput;

public class ShippingAddress {

    public static void main(String[] args){

    /*
     String name= "James King ";
     String buildingNumber= "11821B ";
     String streetName= "Jones Branch Dr ";
     String state= "McLean ";
     String zipCode= "22031A ";
 */
    String name = "Erkan Ozz",
            buildingNumber = "11821B",
            streetName = "Jones Branch Dr",
            city = "McLean",
            state = "VA",
            zipCode = "22031A",
            address = name+ "\n" +buildingNumber+" "+streetName+ " \n" + city+", "+state+" "+zipCode;
        System.out.println(address);

       // System.out.println(name+ "\n" +buildingNumber+" "+streetName+ " \n" + city+", "+state+" "+zipCode );
}
}

/*
        String name = "James King";
        String buildingNumber = "11821B";
        String  streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22031A";
        */

//  System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state +" " + zipCode );
/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125
 */