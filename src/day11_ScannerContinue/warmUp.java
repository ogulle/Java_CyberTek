package day11_ScannerContinue;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Salary:");
        int yourSalary = input.nextInt();
        System.out.println("State Tax: ");
        int stateTax = input.nextInt();

        System.out.println("Federal Tax: ");
        int fedTax = input.nextInt();

        double totalTax = (fedTax/100.0+stateTax/100.0)*yourSalary;
        double salaryAfterTax = yourSalary - totalTax;
        System.out.println("Your salary after tax: " + salaryAfterTax );

    }
}
