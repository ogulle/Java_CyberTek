package day21_MultidimensionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat DF=new DecimalFormat("0.00");
        int[] arr = {4,5,6,7,8,10,20,30,7,8,77};

        double total = 0;

        for (int i = 0; i<arr.length; i++){
            total += arr[i];
        }
        double average = total/arr.length;

        System.out.println("Average= " + average);

        System.out.println(DF.format(average));



    }
}
