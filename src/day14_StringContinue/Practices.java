package day14_StringContinue;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Word:");
        String w1 = scan.next();

        System.out.println("2. Word:");
        String w2 = scan.next();

        System.out.println("3. Word:");
        String w3 = scan.next();

        int c1 = w1.length();
        int c2 = w2.length();
        int c3 = w3.length();

        if (c1 == c2 && c2 == c3){
            System.out.println("All words are same length");
        }
        else if (c1 != c2 && c2 != c3 && c1 != c3){
            System.out.println("All different length");
        }
        else {
            System.out.println("Not same nor different lengths");
        }




    }
}
