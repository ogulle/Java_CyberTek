package day23_methods;

public class Methods {




    public static void main(String[] args){
        printHello5Times();

        System.out.println("====================");

        evenNumbers1_100();
        oddNumbers1_100();

    }

    public static void printHello5Times(){
        for(int i=0; i<5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void evenNumbers1_100(){
        for(int i=1; i<=100; i++){
            if(i%2 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void oddNumbers1_100(){
        for(int i=1; i<=100; i++){
            if(i%2 !=0){
                System.out.print(i+" ");
            }
        }

    }

}
