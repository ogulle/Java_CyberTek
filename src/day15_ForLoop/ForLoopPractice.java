package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int a = 1; a<100; a+=2) {
            System.out.print(a+ " ");
        }
        System.out.println();
        for (int a = 0; a<=100; a+=2){
            System.out.print(a+" ");
        }

        System.out.println();

        String number = "Number";
        for (int i = 1 ; i<5 ; i++){

            System.out.println(number + i);
        }

        String str = "Java";
        String reverse1 = "";
        for (int i = 3; i>=0; i--){
            reverse1 = reverse1 + str.charAt(i);
            System.out.println(reverse1);
        }

        System.out.println(reverse1);

    }
}
