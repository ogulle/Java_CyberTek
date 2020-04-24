package day17_WhileLoops;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxnum = 0;
        int minnum = 0;
        for (int i = 1; i<=5; i++){
            System.out.println(i+". number:");
            int num1 = scan.nextInt();
            if (num1>=maxnum){
                maxnum = num1;
            }
            minnum = num1;
            if (num1<=minnum){
                minnum = num1;
            }


        }
        System.out.println("Maximum number:" + maxnum + "\n Minimum number:" +minnum);




    }
}
