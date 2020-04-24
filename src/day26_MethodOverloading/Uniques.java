package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str = "ABB";
        String result = ""; //A
        //A
        for (int i = 0; i < str.length(); i++) {
            int num = Frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        String str2 = "Cybertek";
        String result2 = uniques(str2);
        System.out.println(result2);

    }

    public static String uniques(String str) {
        String result = ""; //A
        //A
        for (int i = 0; i < str.length(); i++) {
            int num = Frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        return result;

    }


    public static int Frequency(String str, char ch) {
        char[] strArray = str.toCharArray();

        int count = 0;
        for (char eachMatch : strArray) {
            if (eachMatch == ch) {
                count++;
            }
        }
        return count;

    }
}