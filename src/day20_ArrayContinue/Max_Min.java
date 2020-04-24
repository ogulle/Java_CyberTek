package day20_ArrayContinue;

public class Max_Min {
    public static void main(String[] args) {
        int[] main = {2,3,4,5,6,7,8,9};
        int max = 0;
        int min = 0;
        for (int i = 1; i<main.length; i++){
            max = main[0];
            min = main[0];
            if (main[i]>=max){
                max = main[i];
            }
            if (main[i]<=min){
                min = main[i];
            }
        }

        System.out.println("Max:" + max + "\nMin:" + min);



    }
}
