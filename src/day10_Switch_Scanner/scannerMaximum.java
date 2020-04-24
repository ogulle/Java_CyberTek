package day10_Switch_Scanner;

import java.util.Scanner;

public class scannerMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. number: ");
        byte num1 = input.nextByte();
        System.out.println("2. number: ");
        byte num2 = input.nextByte();
        System.out.println("3. number: ");
        byte num3 = input.nextByte();

        byte max = (num1>=num2 && num1>=num3) ? num1 : (num2>=num1 && num2>=num3) ? num2 : num3;

        System.out.println("biggest number: " + max);



    }
}
