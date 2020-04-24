package day14_StringContinue;

public class practice {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);   //false

        if(result){
            System.out.println("Logged in");
        }


        String s1 = "Cybertek School";
        boolean r1 = s1. contains("School");

        System.out.println(r1);


        /*
        valid password Must contain a special characters such as (!, _, $)
        valid password should not contain spaces
         */

        String PassWord = "mmasd1235";

        if(PassWord.contains(" ")){
            System.out.println("Password cannot have a space in it");
        }
        else {
            System.out.println("valid password");
        }


        /*
        every website has "www." at the beginning of the web address
         */

        String webAddress = "www.amazon.com";

                if(webAddress.startsWith("www.")){
                    System.out.println("valid");
                }



    }
}
