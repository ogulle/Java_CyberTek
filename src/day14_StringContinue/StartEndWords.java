package day14_StringContinue;

import java.util.Scanner;

public class StartEndWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Word:");
        String word1 = scan.next();
        System.out.println("2.Word:");
        String word2 = scan.next();

         char c1 = word1.charAt(2);
         char c2 = word2.charAt(2);


        if (word1.length() != 5 || word2.length() != 5){
            System.out.println("need to be exactly 5 chars length");
        }
        else {
            if (word1.substring(4).equals(word2.substring(0,1))){
                System.out.println("Fizz");
            }
            else {
                System.out.println("Buzz - did not match");
            }

        }

        if (c1 == c2){
            System.out.println("equal");
        }



    }
}
