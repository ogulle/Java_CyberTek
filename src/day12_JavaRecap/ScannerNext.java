package day12_JavaRecap;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(str);


        int number  = 10 ;
        if (--number > 10 ) {
            System.out.println(number);
        }
        else
            System.out.println(number);

        boolean x = true;
        boolean y = !x==false;

        if (x)
            System.out.println("hello");
        if (y)
            System.out.println("merhaba");

    }
}
