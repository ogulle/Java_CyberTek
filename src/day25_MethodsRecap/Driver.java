package day25_MethodsRecap;

import java.util.Scanner;

/*
1- write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS

	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class Driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String driver = scan.next();

        System.out.println(getDriver2(driver));

    }
    // Switch Statement
    public static String getDriver1(String driver){

        switch (driver.toLowerCase()){
            case "chrome":
                return "Chrome Driver";

            case "firefox":
                return "Firefox Driver";

            case "id":
                return "Id Driver";

            case "Safari":
                return "Safari Driver";

            case "Edge":
                return "IE Driver";

            case "Opera":
                return "Opera Driver";

            default:
                return "Invalid Driver Name";

        }
    }

        //If method
    public static String getDriver2(String driver){
        if (driver.toLowerCase().equals("chrome")) {
            return "Chrome Driver";
        }
        else if (driver.toLowerCase().equals("firefox")) {
            return "Firefox Driver";
        }
        else if (driver.toLowerCase().equals("id")) {
            return "Id Driver";
        }
        else if (driver.toLowerCase().equals("safari")) {
            return "Safari Driver";
        }
        else if (driver.toLowerCase().equals("edge")) {
            return "IE Driver";
        }
        else if (driver.toLowerCase().equals("opera")) {
            return "Opera Driver";
        }
        else {
            return "Invalid Driver Name";
        }
    }

    //in ternary => ? :
    public static String getDriver3(String driver){
        driver = driver.toLowerCase();

        String result = (driver.equals("chrome")) ? "Chrome Driver" : (driver.equals("firefox")) ? "Firefox Driver" : "Invalid";

        return result;
    }

}
