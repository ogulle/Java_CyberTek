package day20_ArrayContinue;

public class Array_Size {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}; //0~2

       // System.out.println(arr1[100]); // array`s size is fixed

        int [] nums = new int [2];   // {0,0};
        nums [0] = 10;
        nums [1] = 20;

        // nums[2] =30;


        nums = new int[3]; //reset {0,0,0}

        System.out.println(nums[0]);
        System.out.println(nums[1]);

    }
}
