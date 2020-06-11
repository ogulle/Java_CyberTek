package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {

        Credentials Annafacebook = new Credentials();

        Annafacebook.setUserName("A.paulura");
        Annafacebook.setPassWord("1234567");

        System.out.println(Annafacebook.getUserName());
        System.out.println(Annafacebook.getPassWord());


    }

}
