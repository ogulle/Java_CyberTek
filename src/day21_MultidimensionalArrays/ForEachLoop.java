package day21_MultidimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        for(int eachElement : nums){
            System.out.println(eachElement);
        }

        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for(String eachStudent : students){
            System.out.println(eachStudent);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for(int eachNumber : arr1){
            if (eachNumber>4){
                System.out.println(eachNumber);
            }
        }

        System.out.println("==================");

        String sentence = "I like Java";  //Java like I
        String[] words = sentence.split(" "); //[I, like, Java]

        for(String eachWord : words){  //0~2
            System.out.println(eachWord);
        }



        }
}
