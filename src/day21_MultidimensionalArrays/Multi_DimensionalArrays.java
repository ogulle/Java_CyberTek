package day21_MultidimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        int[][] arr2D = {{1,2,3} , {4,5,6,7}};
                    //      0    ,    1

        System.out.println(arr2D.length);

        int[] arr1D = arr2D[0];     //{1,2,3};

        System.out.println(Arrays.toString(arr1D));

        int num1 = arr2D[1][3];
        System.out.println(num1);
                //          0   1      0    1    2
        char[][] ch2D = {{'A', 'B'}, {'D', 'E', 'F'}};
                            //  0           1




    }
}
