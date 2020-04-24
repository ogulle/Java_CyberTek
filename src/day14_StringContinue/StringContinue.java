package day14_StringContinue;

import java.util.Scanner;

public class StringContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First Word:");
        String firstWord = scan.nextLine();



        System.out.println("Second Word:");
        String secondWord = scan.nextLine();

        String output = firstWord.concat(" " + secondWord.concat(" " + secondWord.concat(" " + firstWord)));

        System.out.println(output);

        System.out.println("=========");

        System.out.println("1. Word:");
        String first = scan.nextLine();

        System.out.println("2. Word:");
        String second = scan.nextLine();

        String outcome = first.substring(1).concat(second.substring(1));

        System.out.println(outcome);

        System.out.println("=========");

        /*
        elephant
        01234567

        giraffe
        0123456
         */

        System.out.println("You Word:");
        String yourWord = scan.nextLine();
        int length = yourWord.length();
        String middle = "";

        if (length%2 == 0){
        middle = yourWord.substring((length/2)-1,length/2+1);
        }
        else {
            middle = yourWord.substring(length/2,(length/2)+1);
        }

        System.out.println("The middle character in the string:" + middle);





    }
}
