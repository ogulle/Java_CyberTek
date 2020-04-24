package day18_nestedLoops;

public class DoWhileLoopPractice {
    /*
    print all the even number 0 ~ 100 in the same line separated by a space
     */
    public static void main(String[] args) {
        int num = 0;

        do {
            if (num %2 !=0 ) {

                System.out.print(num + " ");
            }
            num++;
        }while (num<=100);

        System.out.println();



        int i = 1;
        do {
            i++;
            System.out.println(i);

        }while (i<=5);





    }


}
