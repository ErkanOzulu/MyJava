package day31_Constructors.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1=new Restaurant("Ahmet","İstanbul",5);
        Restaurant restaurant2=new Restaurant("Mehmet","Ankara",3);
        Restaurant restaurant3=new Restaurant("Orhan","İzmir",5);

        Server[] servers={new Server("Hasan",1,15,true),
                new Server("Hüseyin",2,10,true),
                new Server("Zübeyir",3,6,false),
                new Server("Ali",4,6,false)};

       Chef [] chefs={
               new Chef("Halim", 23, 35, true),
               new Chef("Habib", 22, 26, false),
               new Chef("Bojan", 21, 27, true),
       };
        restaurant1.hireServers(servers);
        restaurant1.hireChefs(chefs);

        System.out.println(restaurant1);

    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */