package day14_StringContinue;

import java.util.Scanner;

public class Credentials2 {
    /*
        valid credentials are:
        username: cybertek
        password: cybertekschool

        if user entered both valid username and password ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalid ==> invalid username and password

         */

    public static void main(String[] args) {
        String validuserName = "cybertek";
        String validPassword = "cybertekschool";

        Scanner scan = new Scanner(System.in);
        System.out.println("Username:");
        String username = scan.nextLine();

        System.out.println("Password:");
        String password = scan.nextLine();

        if (username.isEmpty() || password.isEmpty()){
            System.out.println("username or password cannot be empty!");
        }
        else {

            boolean usernamecase = validuserName.equals(username);
            boolean passwordcase = validPassword.equals(password);

            if (usernamecase) {
                if (passwordcase) {
                    System.out.println("Logged in");
                } else {
                    System.out.println("password is invalid");
                }
            } else if (passwordcase) {
                if (usernamecase) {
                    System.out.println("Logged in");
                } else {
                    System.out.println("username is invalid");
                }
            } else {
                System.out.println("invalid username and password");
            }
        }

    }
}
