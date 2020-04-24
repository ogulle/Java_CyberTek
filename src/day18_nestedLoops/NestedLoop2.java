package day18_nestedLoops;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * * * *

         */
        for (int i = 1; i<=5 ; i++){

            for (int j = 1; j<=i ; j++){

                System.out.print("* ");


            }
            System.out.println();


        }

        System.out.println("=============================");
        int k = 9;
        for (int i = 9; i>=1 ; i--){

            for (int j = 1; j<=i ; j++ ){

                System.out.print("* ");


            }
            System.out.println();

            k--;

        }

        System.out.println("=======================");

        /*
        a
        a b
        a b c
        a b c d
        a b c d e
         */

        for (char zh = 'z'; zh >= 'a'; zh--) {

            for (char ch = 'a'; ch <= zh; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }













    }
}
