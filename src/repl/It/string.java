package repl.It;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] arr = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int eachRep : arr){
                if(eachRep==arr[i]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }




    }
}
