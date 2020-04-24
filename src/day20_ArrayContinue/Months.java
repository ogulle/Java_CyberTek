package day20_ArrayContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String[] months = {"January" , "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of month?");
        int index = scan.nextInt();

        int attempts = 1;

        while (index > 12 || index <=0 ){
            System.out.println("Invalid entry");
            System.out.println("Please re-enter the number");
            index = scan.nextInt();
            attempts++;

            if (attempts == 3 && (index > 12 || index <=0)){
                System.out.println("Invalid entry, you already have 3 attempts");
                System.exit(0);
            }
        }

        System.out.println("Month:" + months[index-1]);

    }
}
