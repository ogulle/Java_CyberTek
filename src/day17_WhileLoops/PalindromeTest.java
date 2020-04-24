package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "Level";
        String reversedStr = ""; //store the reversed version of str

        int length = str.length()-1;

        while (length>=0){
            reversedStr += str.charAt(length);
            length--;
        }
        boolean palindrome = reversedStr.equals(str);
        System.out.println(palindrome);

    }
}
