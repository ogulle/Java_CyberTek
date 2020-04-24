package day22_Arrays_Loops;

public class NestedLoopPractice {
    public static void main(String[] args) {
        int[][] numbers = {
                            {1,2,3},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14},
                            {15,16,17,18,19,20,21}
                        };
            //1. print all even numbers in a same line
            //2. count odd numbers ==> return the total odd number
        int oddNumbers = 0;
        for(int i=0; i<numbers.length; i++){
            for (int eachEven : numbers[i]){
                if (eachEven%2 == 0){
                    System.out.print(eachEven+" ");
                }
                else{
                    oddNumbers++;
                }
            }
        }
        System.out.println();
        System.out.println(oddNumbers);

    }
}
