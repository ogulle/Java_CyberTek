package day17_WhileLoops;

import java.util.Scanner;

public class warmUp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = "";
        for (int i = 1 ; i <= 30; i ++){
            number = "" + i;
            if (i%3==0 && i%5==0){
                number = "FFINRA";
            }
            else if (i%3 == 0){
                number = "FIN";
            }
            else if (i%5 == 0){
                number = "RA";
            }

            System.out.print(number+" ");
        }




    }
}
