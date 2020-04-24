package day05_Unary_ShorthandOperators;

public class Tasks {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a ++ + a-- + a++;
        System.out.println(a);

        int x = 4;
        int y = x * 4 - x ++;
        System.out.println(y);

        int a1  = 1;
        a1 = -a1-- + a1++ / -a1-- * --a1;
        //   -1

        System.out.println(a1);

        int b1 = 5;
        b1 = b1--;

        System.out.println(b1);
        int b2 = b1-- + 4;
        System.out.println(b2);
        System.out.println(b1);





    }
}
