package day18_nestedLoops;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. number:");
        int first = scan.nextInt();
        System.out.println("2. number:");
        int second = scan.nextInt();

        int answer = 0;

        while (first>=second){
            first -= second;
            answer ++;
        }
        System.out.println(answer);





    }
}
