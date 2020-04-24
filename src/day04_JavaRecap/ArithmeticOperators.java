package day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {

        double d = 10/4;
            // double d = 2;
            // d ==> 2.0;
        System.out.println(d);

        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10.0/4.0);

        float f1 = 10 / 4f;
        // float f1 = 2;
        System.out.println(f1); //2.0

        boolean evenNumber = 25 % 2 == 0;
            //if 25/2 has a remainder of zero, then its even number
        System.out.println(evenNumber); //false

        System.out.println(10 % 2 == 0);    //10 is even number
        System.out.println(11 % 2 != 0);    //11 is odd number

        System.out.println("10 is even number: " + (10 % 2 == 0 ));
        System.out.println("11 is even number: " + (11 % 2 == 0));

        System.out.println("25 is odd number: " + (25 % 2 != 0));

        System.out.println("25 is even number: " + (25 % 2 == 0) );
        System.out.println("25 is even number: " + (25 % 2 != 0));

    }
}
