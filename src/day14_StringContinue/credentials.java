package day14_StringContinue;
    /*
    userName: cybertek
    password: cybertekschool
     */

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        Scanner scan = new Scanner(System.in);

        System.out.println("Username:");
        String userName = scan.nextLine();

        System.out.println("Password:");
        String passWord = scan.nextLine();

        if(validUserName.equals(userName) && validPassWord.equals(passWord)){
            System.out.println("Logged in successfully");
        }
        else{
            System.out.println("Invalid credentials");
        }



    }
}
