package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        boolean valid = (!word.equalsIgnoreCase("Yes") || !word.equalsIgnoreCase("No"));
        while (valid){

            System.out.println("Enter Yes or No");
            String word1 = input.next();
            word = word1;
            if (word.equalsIgnoreCase("Yes")) {
                System.out.println("Entered Yes");
                break;
            }
            if (word.equalsIgnoreCase("No")) {
                System.out.println("Entered No");
                break;
            }else {
                System.out.println("Wrong Entry!");
            }

        }




    }
}
