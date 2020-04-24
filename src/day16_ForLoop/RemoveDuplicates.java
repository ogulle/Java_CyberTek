package day16_ForLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();

        int length = word.length();
        String duplicate = "";
            for ( int i = 0; i<length; i++){
               /* if(!duplicate.contains(""+word.charAt(i))) {

                    duplicate += word.charAt(i);
                }
*/
               if (duplicate.contains(""+word.charAt(i))){
                   continue;
               }
                duplicate += word.charAt(i);
            }
        System.out.print(duplicate);






    }
}
