package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

        int a = 101;
        boolean evenNumber = a % 2 == 0; //if a number can be divided by 2 without the remainder it prints out

            if ( evenNumber) {
                System.out.println(a + " is even number");
            }
            else
            {
                System.out.println(a + " is not even number");
            }
    }
}
