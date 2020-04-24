package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str = "I love Java Programming John";
            int num1 = str.indexOf("John");

        System.out.println(num1);

        String str2 = "Cybertek school is awesome";
        //             0123456789
        int firstS = str2.indexOf("s");
        int secondS = str2.indexOf("is")+1;
        //      str2.indexOf
        System.out.println(firstS);
        System.out.println(secondS);


        String fullname = "Kuzzat Altay";
        String firstname = fullname.substring(0,fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" ") + 1);

        System.out.println(firstname);
        System.out.println(lastname);


    }
}
