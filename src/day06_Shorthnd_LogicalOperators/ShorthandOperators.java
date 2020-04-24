package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 20;
            x += 10; // x = x + 10 - 30

        String schoolname = "CyberTek";
            schoolname += 12345; // schoolname = schoolname + 12345
        System.out.println(schoolname);

        System.out.println('a' + 'b');
                        // 97 + 97 ==> 195

        char ch1 = 'a';
            ch1 += 'b';
        System.out.println(ch1); //character4

        int num = 'z';
            num += 'x';
        System.out.println(num);

        int a1 = 100; //200
        int b1 = a1 *= 2 + ++a1;
        System.out.println(b1);

    }
}
