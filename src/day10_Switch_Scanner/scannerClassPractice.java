package day10_Switch_Scanner;

import java.util.Scanner;

public class scannerClassPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number 1: ");
        byte num1 = input.nextByte();
        System.out.println("Number 2: ");
        byte num2 = input.nextByte();
        System.out.println("You have entered: " + num1 + " & " + num2);

    }
}
