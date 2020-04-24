package day13_StringClass;

import java.util.Scanner;

public class StringManipulations_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Name:");
        String fullName = scan.nextLine();

        String firsName = fullName.substring(0, fullName.lastIndexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

       firsName = firsName.substring(0,1).toUpperCase() + firsName.substring(1).toLowerCase();
       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firsName);
        System.out.println(lastName);

        String initial = firsName.substring(0,1) + lastName.substring(0,1);

        System.out.println(initial);







    }
}
