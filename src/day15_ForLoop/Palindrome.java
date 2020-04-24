package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        String str = scan.next();
        int length = str.length()-1;

        String reverse1 = "";

        for (int i = length; i>=0; i--){
            reverse1 = reverse1 + str.charAt(i);
        }

        boolean check = str.equals(reverse1);

        System.out.println(check);


    }
}
