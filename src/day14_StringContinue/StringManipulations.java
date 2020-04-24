package day14_StringContinue;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "I like to learn Java. I like to watch the movie Jumanji";

        int a1 = str.indexOf("J");

        System.out.println(a1);

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        String s = "I like Java, and I like reading";

        int b1 = s.lastIndexOf("I");
        System.out.println(b1);

        int b2 = s.lastIndexOf("l");
        System.out.println(b2);


    }
}
