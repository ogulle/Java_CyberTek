package day22_Arrays_Loops;

public class NestedLoop2 {
    public static void main(String[] args) {
        int[][] numbers = { {9,8,7}, {6}, {5,4,3,2,1,0} };

        for (int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]+" ");
            }

        }

        System.out.println();
        System.out.println("++++++++++reversed++++++++++");

        for (int k=numbers.length-1; k>=0; k--) { //k: index num of 1D arrays (reversed)

            for (int i = 0; i < numbers[k].length ; i++) {   // i: index num of elements in 1D array
                System.out.print(numbers[k][i] + " ");
            }
        }
        System.out.println();
        System.out.println("++++++++++reversed++++++++++");

        for (int k=numbers.length-1; k>=0; k--) {   //k: index num of 1D arrays (reversed)

            for (int i = numbers[k].length - 1; i >= 0; i--) { //i: index num of elements in 1D array (reversed)
                System.out.print(numbers[k][i] + " ");
            }
        }

    }
}
