package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr = {10,78,2,-1,500,70};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] arrReverse = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            arrReverse[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arrReverse));

    }
}
