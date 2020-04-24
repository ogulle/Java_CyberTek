package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
        //pre: changes the value of the variable immediately

        int a = 100;
        System.out.println(++ a); // a = 101

        System.out.println(a);

        int b = 100;
        System.out.println(b++); //prints out 100 and make 101
        System.out.println( b);

        int z = 10;
        int x = ++z;

        System.out.println(x); //11
        System.out.println(z); //11

        int s = 10;
        int f = s++;

        System.out.println(f);
        System.out.println(s);
    }
}
