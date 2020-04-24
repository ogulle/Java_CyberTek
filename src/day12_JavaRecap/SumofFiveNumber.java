package day12_JavaRecap;

import java.util.Scanner;

public class SumofFiveNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.println("1. number:");
        int num1 = scan.nextInt();
        if (num1 > 0)
            sum += num1;

        System.out.println("2. number:");
        int num2 = scan.nextInt();
        if (num2 > 0)
            sum += num2;

        System.out.println("3. number:");
        int num3 = scan.nextInt();
        if (num3 > 0)
            sum += num3;

        System.out.println("4. number:");
        int num4 = scan.nextInt();
        if (num4 > 0)
            sum += num4;

        System.out.println("5. number:");
        int num5 = scan.nextInt();
        if (num5 > 0)
            sum += num5;

        System.out.println("Total= " + sum);

    }
}
