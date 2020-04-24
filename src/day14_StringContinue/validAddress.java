package day14_StringContinue;

public class validAddress {
    public static void main(String[] args) {
        String webAddress = "wwW.amazon.com";
        boolean b1 = webAddress.startsWith("www.");
        boolean b2 = webAddress.endsWith(".com") || webAddress.endsWith( ".edu") || webAddress.endsWith(".net") || webAddress.endsWith(".gov");

        if (b1 && b2){
            System.out.println("Valid Address");
        }
        else{
            System.out.println("Invalid Address");
        }







    }
}
