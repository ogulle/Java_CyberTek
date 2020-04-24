package day20_ArrayContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Number of day?");
        int num = scan.nextInt();



        int attempts = 3;
        while (num<=0 || num >7){
            attempts--;
            if ( attempts ==0){
                System.out.println("Entry has been declined");
                System.exit(0);
            }

            System.out.println("Invalid entry. please re-enter! (" + attempts + " attempts left)");
            num = scan.nextInt();


        }
        String result = days[num-1];
        System.out.println("Day: "+ result);


    }
}
