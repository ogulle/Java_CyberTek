package day11_ScannerContinue;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("what is your age? ");
        int age = input.nextByte(); //30 + Enter

        System.out.println("your age is: " + age);

        System.out.println("what is your full name?");
        String fullName = input.nextLine();

        input.nextLine(); //Enter

        System.out.println("your full name: " + fullName);

    }
}
