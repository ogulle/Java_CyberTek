package repl.It;

import java.util.Arrays;

public class string {
    public static void main(String[] args) {


        int arr[] = new int[81];
        for (int each: arr){

        }

        System.out.println(Arrays.toString(arr));
        for(int eachEven : arr){
            if(eachEven%2 ==0){
                System.out.print(eachEven+ " " );
            }
        }
    }
}
