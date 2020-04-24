package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your salary?");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("What is your full name?");
        String fullName = scan.nextLine();

        System.out.println("what is your company name?");
        String companyName = scan.nextLine();

        System.out.println("Enter your SSN:");
        String ssn = scan.nextLine();

        System.out.println("What is you job title?");
        String jobTitle = scan.nextLine();

        System.out.println("Salary:$" + salary + "\n" + "Name:" + fullName + "\nCompany:" + companyName + "\nSSN:" + ssn + "\nTitle:" + jobTitle );

    }
}
