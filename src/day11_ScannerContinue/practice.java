package day11_ScannerContinue;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name:");
        String firstName = input.next();

        System.out.println("Enter your Last Name:");
        String lastName= input.next();

        System.out.println("Are you employed?");
        boolean employed = input.nextBoolean();

        long salary = 0;
        String employee = "Unemployed";

        if (employed) {
            employee = "Employed";
            System.out.println("What is your salary?");
            salary = input.nextLong();
        }

        String result = "Full Name: " + firstName + " " + lastName + "\n" + "Employee Status: " + employee +
                "\n" + "Salary: $" + salary;

        System.out.println(result);
    }
}
