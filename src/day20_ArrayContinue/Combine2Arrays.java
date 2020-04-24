package day20_ArrayContinue;

import java.util.Arrays;

public class Combine2Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length];


        for (int i= 0; i < 3; i++){
            arr3[i] = arr1[i];
        }
        for (int j = 3; j < 7; j++ ){
            arr3[j] = arr2[j-3];
        }

        System.out.println(Arrays.toString(arr3));




    }
}
