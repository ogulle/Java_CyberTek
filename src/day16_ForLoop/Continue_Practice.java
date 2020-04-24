package day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        for (char ch = 'z'; ch >= 'a' ; ch--){
            if (ch == 'd' || ch == 'h' || ch == 'j' || ch == 'y'){
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println();

        for ( int i = 0; i<=100; i++){
            if(i%3==0 || i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }



    }

}
