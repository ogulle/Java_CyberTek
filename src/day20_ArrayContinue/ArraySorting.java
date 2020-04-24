package day20_ArrayContinue;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length-1]);


        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));


        String[] names = {"Deniz", "Osman", "Rustem", "Anna", "Ali"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        int[] arr = {3, 1, 4, -1, 100, -100, 200, 155};
        Arrays.sort(arr);

        int[] arrDesc= new int[arr.length];

        System.out.println(Arrays.toString(arr));
        int j = 0;

        for (int i = arr.length-1; i>=0; i--){
            //System.out.print(arr[i]+" ");
            arrDesc[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(arrDesc));

    }
}
