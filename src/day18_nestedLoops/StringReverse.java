package day18_nestedLoops;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Java";
        String reverse = "";
        int i = str.length()-1;
        do{
            reverse += "" + str.charAt(i);

            i--;
        }while (i>=0);
        System.out.println(reverse);




    }
}
