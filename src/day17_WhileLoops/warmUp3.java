package day17_WhileLoops;

import java.util.Scanner;

public class warmUp3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<1;) {
            int answer = 0;
            System.out.println("Enter first number");
            int firsNumber = scan.nextInt();
            System.out.println("Enter second number");
            int secondNumber = scan.nextInt();
            System.out.println("Enter math operators");
            scan.nextLine();
            String operator = scan.nextLine();
            answer = operator.equals("+") ? firsNumber + secondNumber : operator.equals("-") ? firsNumber - secondNumber : operator.equals("*") ? firsNumber * secondNumber
                    : operator.equals("/") ? firsNumber / secondNumber : operator.equals("%") ? firsNumber % secondNumber : 0;
            System.out.println("Answer: " + answer);
            System.out.println("Do you want to calculate another numbers?");
            String yesNo = scan.next();
            if (yesNo.equalsIgnoreCase("no")) {
                break;
            }
        }



    }
}
