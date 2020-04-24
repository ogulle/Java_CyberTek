package day15_ForLoop;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your name:");
        String name = scan.nextLine();

        System.out.println("Please type your lastname:");
        String lastName = scan.nextLine();

        String initial = (name.substring(0,1) + lastName.substring(0,1)).toUpperCase();

        System.out.println("Welcome " + initial + "!");


        String str = "Java";
        String firstSolution = str.substring(3) + str.substring(2,3) + str.substring(1,2) + str.substring(0,1);
        System.out.println(firstSolution);


        String secondSolution = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        System.out.println(secondSolution);
    }
}
