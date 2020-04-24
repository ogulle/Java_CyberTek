package day22_Arrays_Loops;

import java.util.Scanner;

public class ScannerWithArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0; i<arr.length; i++){
            System.out.println("Word:");
            arr[i] = scan.next();
        }
        for(String eachThree : arr){
            System.out.println(eachThree.substring(0,3));
        }


    }
}
