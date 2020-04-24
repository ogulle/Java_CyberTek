package day21_MultidimensionalArrays;

public class emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String EachEmail : emails) {
            if (!EachEmail.endsWith("@gmail.com")) {
                System.out.println(EachEmail);
            }
        }


    }
}
