package day05_Unary_ShorthandOperators;

public class Divisibility {
    public static void main(String[] args) {
        int number1 = 65;
        boolean div2 = 65 % 2 == 0;
        boolean div3 = 65 % 3 == 0;
        boolean div5 = 65 % 5 == 0;

        System.out.println("65 is divisible by 2:" + div2);
        System.out.println("65 is divisible by 3:" + div3);
        System.out.println("65 is divisible by 5:" + div5);

        System.out.println("=====================");

        int number2 = 80;
        boolean div12 = 80 % 2 == 0;
        boolean div13 = 80 % 3 == 0;
        boolean div15 = 80 % 5 == 0;

        System.out.println("80 is divisible by 2:" + div2);
        System.out.println("80 is divisible by 3:" + div3);
        System.out.println("80 is divisible by 5:" + div5);
    }
}
