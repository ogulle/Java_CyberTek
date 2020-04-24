package day19_Arrays;

import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};

        System.out.println(arr.length); //3
        int[] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String[] Testers = new String[3]; //{"Reem", "Madina", "Osman"}
                    // index: 0, 1, 2

        Testers[0] = "Reem";
        Testers[2] = "Osman";
        Testers[1] = "Madina";


        System.out.println(Testers[0]); //Reem
        System.out.println(Testers[1]); //Null
        System.out.println(Testers[2]); //Osman

        System.out.println(Testers.length);


        System.out.println("=======================");
        Scanner scan = new Scanner(System.in);

        String[] students = new String[10];

        for (int i = 0; i < 10 ; i++){
            System.out.println((i+1) +". name:");
            String names = scan.next();
            students[i] = names;
        }
        for (int i = 0; i < 10 ; i++){
            System.out.println(students[i]);
        }


    }
}
