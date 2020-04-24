package day11_ScannerContinue;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the full name: ");
        String fullName = input.nextLine();

        System.out.println(fullName);

    }
}
