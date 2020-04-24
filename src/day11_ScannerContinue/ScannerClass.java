package day11_ScannerContinue;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a long number: ");
        long a = input.nextLong();
        System.out.println("You have entered: " + a);

        System.out.println("Enter a decimal: ");
        float b = input.nextFloat();

        System.out.println("You have entered: " + b);

        System.out.println("Enter true or false");
        boolean bool = input.nextBoolean();
        System.out.println(bool);

        System.out.println("Enter your sentence");
        String next = input.next();
        System.out.println(next);
    }
}
