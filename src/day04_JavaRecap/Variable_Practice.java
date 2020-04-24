package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {

        byte num1 = 127;
        short num2 = num1;

        int num4 = num2;

        double num8 = 0.5f;
        double num9 = 9999999L;
        double num10 = 100.5;

        System.out.println(num10);

        char ch1 = '$';  // every single character has a corresponding number
        System.out.println(ch1); //$

        char ch2 = 22000;

        double d1 = 'z' + '8';
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( 9>10 ); //false

        System.out.println( 9 >= 9 ); //true

        System.out.println( 'a' == 'b' ); //false

        System.out.println( 'a' == 'b' - 1 ); //true

        boolean r1 = !true; // false

        System.out.println(r1);
        System.out.println(!r1);

        System.out.println(!true != !false); //true




    }
}
