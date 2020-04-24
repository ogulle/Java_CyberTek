package day19_Arrays;

public class WarmUp {
    public static void main(String[] args) {
        String str = "AABCC";
        String str2 = "";

        for (int i = 0; i<str.length(); i++){
            boolean valid = str2.contains("" +  str.charAt(i));
            while (!valid){
                str2 += str.charAt(i);
                break;
            }

        }

        System.out.println(str2);



    }
}
