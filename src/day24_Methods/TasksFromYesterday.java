package day24_Methods;

import java.util.Arrays;

public class TasksFromYesterday {
    /*
    4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */

    public static void main(String[] args) {

        int[] arr1 = {1,5,6,3,8,15,21,11,7};
        maxmin(arr1);
        reverse(arr1);

    }

    public static void maxmin(int[] arr){
        int max = 0;
        int min = arr[0];
         for (int i=0; i<arr.length; i++){
             if(arr[i]>max){
                 max = arr[i];
             }
             else if (arr[i]<min){
                 min = arr[i];
             }
         }
        System.out.println("Maxmimum:"+max);
        System.out.println("Minimum:" +min);
    }

    public static void reverse(int[] arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i>=0; i-- ){
            System.out.print(arr[i]+" ");
        }
    }


}
