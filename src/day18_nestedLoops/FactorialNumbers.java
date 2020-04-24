package day18_nestedLoops;

import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number:");
        int number = scan.nextInt();
        int answer = 1;

        while (number>0){
             answer *= number;
             number --;

        }
        System.out.println("Answer: " + answer);





    }
}
