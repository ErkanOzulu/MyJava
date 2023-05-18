package day11_Switch_Scanner;

public class T3_Browser {

    public static void main(String[] args) {


        String browserName="chrome";
        String result="";
        boolean validBrowser=browserName=="chrome"||browserName=="firefox"||browserName=="opera"
                                || browserName=="safari"||browserName=="edge";


        if (validBrowser) {
            // 5 options
            if (browserName=="chrome"){
                result="Chrome Browser is selected";
            } else if (browserName=="FireFox") {
                result="FireFox Browser is selected";
            } else if (browserName=="Opera") {
                result="Opera Browser is selected";
            } else if (browserName=="Safari") {
                result="Safari Browser is selected";
            }else {
                result="Edge Browser is selected";
            }

        }else{
            result="Invalid Browser Name";
        }
        System.out.println(result);


        System.out.println("========================second way =============");

// Do Not use if statement or ternary


        String browserName1="Safari";
        String result2="";

       switch (browserName1){
            case "Chrome":
            result2="Chrome Browser is selected";
            break;
            case "Firefox":
                result2="Firefox Browser is selected";
                break;
            case "Opera":
                result2="Opera Browser is selected";
                break;
            case "Safari":
                result2="Safari Browser is selected";
            case "Edge":
                result2="Edge Browser is selected";
                break;
           default:
               result2="Invalid Browser Name";

        }

        System.out.println(result2);





    }

}
/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if

2--        	Do Not use if statement or ternary
 */