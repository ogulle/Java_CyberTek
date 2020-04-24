package day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //            012345678
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);


        String Murtaza = "Murtaza Nazeeri";
                          //01234567891011121314
        String firstName = Murtaza.substring(0,7);
                          String lastName = Murtaza.substring(8,15);
                          String gmail = lastName + "_" + firstName + "@gmail.com";

        System.out.println(gmail);


        String s1 = "I love Java Programming Language";
        //           01234567

        String className = s1.substring(7);

        System.out.println(className);

        String s2 = "I love C# Programming Language C# C#";
            s2 = s2.replace("C#", "Java" );

        System.out.println(s2);

        String name = "COVID 18";
            name = name.replace("8", "9");

        System.out.println(name);




    }
}
