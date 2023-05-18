package day35_Encapsulation.restaurant;

public class Server {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println(name+" is taking an order");
    }
    public  void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }



    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + ((fullTime)?"full-time":"part time")+
                '}';
    }
}

/*
6. Restaurant Task:
		6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */