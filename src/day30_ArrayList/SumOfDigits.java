package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {
    /*
    1. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */

    public static void main(String[] args) {
        String str = "Today's date is 04/27/2020";

        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            for(int j=48; j<=57; j++){
            if (ch == j) {
                int num = Integer.parseInt(str.substring(i,i+1));
                count += num;
            }
            }
        }
        System.out.println(count);

        System.out.println("==============Muhtar`s Method============");
        String str1 = "a1b2c3";
        char[] arr = str1.toCharArray();

        System.out.println(Arrays.toString(arr));

        int sum = 0;    //will contain sum of all digits

        for(char each : arr) {   //'0'
            boolean isDigit = each >= 48 && each <= 57;
            /*
            if (isDigit) {

                sum += Integer.parseInt("" + each);  //"0"
            }
            */

            if( Character.isDigit(each) ){  // isDigit(): identifies if the given character is digit
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);


        Character.isAlphabetic('A'); //identifies if the character is alphabet

        /*
        assignment task:
            extract the digits and letters form a string
         */


    }
}
