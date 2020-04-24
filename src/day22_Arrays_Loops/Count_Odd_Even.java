package day22_Arrays_Loops;

public class Count_Odd_Even {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int even = 0;
        int odd = 0;
        for (int eachNumber : arr){
            if(eachNumber%2==0){
                even++;
            }
            else if(eachNumber%2!=0){
                odd++;
            }
        }
        System.out.println("Even: "+ even);
        System.out.println("Odd: " + odd);




    }
}
