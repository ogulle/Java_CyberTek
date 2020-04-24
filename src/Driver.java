import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_")){
            int beginning = email.indexOf("_");
            int end = email.indexOf("@");
            String firstName = email.substring(0,beginning);
            String lastName = email.substring(beginning+1,end);
            String rest = email.substring(end,email.length());
            System.out.println(lastName+"_"+firstName+rest);
        }
        else{
            System.out.print(email);
        }

    }
}
