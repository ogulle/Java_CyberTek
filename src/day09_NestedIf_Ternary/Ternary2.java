package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        //ternary: ? means if, : else
        String result = "";
        if (9>10){
            result = "9 is greater";
        } else {
            result = "10 is greater";
        }
        String  result2 = (9>10) ? "9 is greater" : "10 is greater";

        System.out.println(result);
        System.out.println(result2);
    }
}
