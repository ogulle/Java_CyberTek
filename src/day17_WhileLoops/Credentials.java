package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        System.out.println("==========");

        Scanner scan = new Scanner(System.in);
        String userName = "ogulle";
        String passWord = "parola";
        int j=3;
        while (j>0){
            System.out.println("Enter your username:");
            String name = scan.next();
            System.out.println("Enter your password:");
            String pass = scan.next();
            if (userName.equalsIgnoreCase(name) && passWord.equalsIgnoreCase(pass)){
                System.out.println("Welcome!");
                break;
            }
            else {
                j--;
                if( j == 0){
                    System.out.println("Login failed");
                    break;

                }
                System.out.println("Wrong username or password"+"\n"+j+" attempts left!");
            }


        }
    }
}
