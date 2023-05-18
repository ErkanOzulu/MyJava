package day35_Encapsulation.scrumTask;

import day35_Encapsulation.Bank;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
   private String PO, BA,SM;

   private ArrayList<Tester>testersList=new ArrayList<>();
    private ArrayList<Developer> devopList=new ArrayList<>();
    private int dayOfSprint;

    public String getPO() {
        return PO;
    }

    public String getBA() {
        return BA;
    }

    public String getSM() {
        return SM;
    }

    public int getDayOfSprint() {
        return dayOfSprint;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }

    public ArrayList<Developer> getDevopList() {
        return devopList;
    }


    public void setPO(String PO) {
        this.PO = PO;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public void setDayOfSprint(int dayOfSprint) {
        this.dayOfSprint = dayOfSprint;
    }



    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDayOfSprint(dayOfSprint);
        testersList = new ArrayList<>(); // ArrayList' Object has to be created to use the ArrayList
        devopList = new ArrayList<>(); // ArrayList' Object has to be created to use the ArrayList
    }


    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers) {
        this.testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        devopList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        this.devopList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
      testersList.removeIf(p->p.getEmployeeID()==employeeID);
    }
    public void removeDeveloper(int employeeID){
        devopList.removeIf(p-> p.getEmployeeID()==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopList.size() +
                ", dayOfSprint=" + dayOfSprint +
                '}';
    }
}
/*
create a class called ScrumTeam
	           Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name

 */