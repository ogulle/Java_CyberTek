package day05_Unary_ShorthandOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10; // pos 10
        int b = +a; // pos 10

        System.out.println(a);
        System.out.println(b);

        int a2 = - 10 ;
        boolean result = a2 > 0;
        System.out.println(result);

        int P = 100;
        System.out.println(P++);
        System.out.println(P);



    }
}
