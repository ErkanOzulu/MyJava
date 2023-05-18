package day20_Arrays;

public class T3_Shopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        String a = "Gloves";

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(a)) {
                System.out.println(i);
                break; // find out the first index number of "Gloves"
            }

        }

        for (int j = 0; j < items.length; j++) {
            boolean include = items[j].contains("iPad"); //find out if "iPad" is contained in the item list
            if (include) {
                System.out.println(items[j].contains("iPad"));
            }
        }
      /*
      Print the report of each shopping item
      name - price - #ID
       */

        for (int i = 0; i < items.length; i++) {
            String report=items[i]+" - $"+prices[i]+" - "+itemIDs[i];
            System.out.println(report);
        }


    }
}


/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID


 */
