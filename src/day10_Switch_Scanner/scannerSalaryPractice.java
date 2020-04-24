package day10_Switch_Scanner;

import java.util.Scanner;

public class scannerSalaryPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary? ");
        int salary = input.nextInt();
        System.out.println("How many hours do you work in a week? ");
        byte hour = input.nextByte();
        int rate = salary / (52*hour);
        System.out.println("Your hourly rate: " + rate);




    }



}
