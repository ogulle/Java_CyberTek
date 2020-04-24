package day13_StringClass;

import java.util.Scanner;

public class address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Building Number:");
        String buildingNum = input.next(); //112A Enter

        input.nextLine(); //Enter

        System.out.println("Street Address:");
        String streetAddress = input.nextLine();

        System.out.println("City Name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state:");
        String stateName = input.nextLine();

        System.out.println("Zipcode:");
        String zipCode = input.next();

        input.nextLine(); //Enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        String result = "Ship To:    " + fullName + "\n" + "\t\t\t" + buildingNum + " " + streetAddress + "\n" + "\t\t\t" + cityName + ", " + stateName + " " + zipCode;

        System.out.println(result);





    }
}
