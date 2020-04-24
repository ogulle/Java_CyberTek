package day23_methods;

public class Methods_WithParameters2 {
    public static void main(String[] args) {
        String name1 = "Muhtar";
        reverse(name1);
        System.out.println("hello");

        String name2 = "Osman";
        reverse(name2);

    }

    public static void reverse(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
