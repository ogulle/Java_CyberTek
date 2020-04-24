package day16_ForLoop;

public class WarmUp {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100 ; i+=2){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = 2 ; i <= 100 ; i+=2){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        int num = 0;
        for (int i = 0 ; i <= 100 ; i+=2){
            num += i;
        }
        System.out.print("Sum:"+ num);

        System.out.println();
        int num1 = 0;
        for (int i = 1 ; i <= 100 ; i+=2){
            num1 += i;
        }
        System.out.print("Sum:"+ num1);

        System.out.println();

        int num2 = 100;
        int num3 = 0;
        for (int i = 1 ; i <= num2 ; i+=1){
            num3 += i;
        }
        System.out.print("Sum:"+ num3);


    }
}
