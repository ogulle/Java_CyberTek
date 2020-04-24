package day22_Arrays_Loops;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i=0; i<1000; i++){
            numbers[i] = i+1;

        }
        for (int eachEvenNumber : numbers){
            if (eachEvenNumber%2==0){
                System.out.println(eachEvenNumber);
            }
        }


    }
}
