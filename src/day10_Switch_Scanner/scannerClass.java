package day10_Switch_Scanner;

import java.util.Scanner;

public class scannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte nummber: ");
        byte num1 = input.nextByte();

        System.out.println("you have entered:" + num1);

        if(num1%2 == 0) {
            System.out.println(num1 + " is even number");
        }
        else {
            System.out.println(num1 + " is odd number");
        }

    }

}
